package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.IcingsUser;

@Repository("icingUserRepository")
public interface IcingUserRepository extends JpaRepository<IcingsUser, Integer>{
	
	@Query("SELECT IU FROM IcingsUser IU")
	public List getAllIcingsUser();
	
	@Query("SELECT IU FROM IcingsUser IU WHERE IU.id =:id")
	public List getAllIcingsUserByid(@Param ("id") Integer id);
		
	@Query("SELECT IU FROM IcingsUser IU WHERE IU.id =:id")
	public IcingsUser getIcingsUserbyId(@Param ("id") Integer id);
	 
	@Query("SELECT IU FROM IcingsUser IU WHERE IU.user.userName =:userName")
	public List getAllIcingsUserByUserName(@Param ("userName") String userName);
	
	@Query("SELECT IU FROM IcingsUser IU WHERE IU.id=(SELECT max(IU.id) FROM IcingsUser IU)")
	public List getIcingsUserByMaxid();
	

}
