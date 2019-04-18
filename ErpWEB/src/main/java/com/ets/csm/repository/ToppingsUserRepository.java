package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.ToppingsUser;

@Repository("toppingUserRepository")
public interface ToppingsUserRepository extends JpaRepository<ToppingsUser, Integer>{
	
	@Query("SELECT TU FROM ToppingsUser TU")
	public List getAllToppingsUser();
	
	@Query("SELECT TU FROM ToppingsUser TU WHERE TU.id =:id")
	public List getAllToppingsUserByid(@Param ("id") Integer id);
	
	@Query("SELECT TU FROM ToppingsUser TU WHERE TU.id =:id")
	public ToppingsUser getallToppingsUserById(@Param ("id") Integer id);
	
	@Query("SELECT TU FROM ToppingsUser TU WHERE TU.user.userName =:userName order by TU.id desc")
	public List getAllToppingsUserByUsername(@Param ("userName") String userName);
	

}
