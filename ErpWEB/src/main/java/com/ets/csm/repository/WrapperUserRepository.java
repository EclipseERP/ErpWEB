package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.WrapperUser;

@Repository("wrapperUserRepository")
public interface WrapperUserRepository extends JpaRepository<WrapperUser, Integer>{
	
	@Query("SELECT WU FROM WrapperUser WU")
	public List getAllWrapperUser();
	
	@Query("SELECT WU FROM WrapperUser WU WHERE WU.id =:id")
	public List getAllWrapperUserByid(@Param ("id") Integer id);
	
	@Query("SELECT WU FROM WrapperUser WU WHERE WU.id =:id")
	public WrapperUser getallWrapperUserById(@Param ("id") Integer id);
	
	@Query("SELECT WU FROM WrapperUser WU WHERE WU.user.userName =:userName order by WU.id desc")
	public List getAllWrapperUserByUsername(@Param ("userName") String userName);
	

}
