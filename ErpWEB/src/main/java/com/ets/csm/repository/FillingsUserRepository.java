package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.FillingsUser;

@Repository("FillingsUserRepository")
public interface FillingsUserRepository extends JpaRepository<FillingsUser, Integer>{
	
	@Query("SELECT FU FROM FillingsUser FU")
	public List getAllFillingsUser();
	
	@Query("SELECT FU FROM FillingsUser FU WHERE FU.id =:id")
	public List getAllFillingsUserByid(@Param ("id") Integer id);
	
	@Query("SELECT FU FROM FillingsUser FU WHERE FU.id =:id")
	public FillingsUser getallFillingsUserById(@Param ("id") Integer id);
	
	@Query("SELECT FU FROM FillingsUser FU WHERE FU.user.userName =:userName order by FU.id desc")
	public List getAllFillingsUserByUsername(@Param ("userName") String userName);
	
	@Query("SELECT FU FROM FillingsUser FU WHERE  FU.id=(SELECT max(FU.id) FROM FillingsUser FU)")
	public List getFillingsUserByMaxid();
	

}
