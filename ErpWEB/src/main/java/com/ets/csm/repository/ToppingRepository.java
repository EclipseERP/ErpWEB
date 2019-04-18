package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.ToppingsList;

@Repository("toppingRepository")
public interface ToppingRepository extends JpaRepository<ToppingsList, Integer>{
	
	@Query("SELECT T FROM ToppingsList T")
	public List getAllToppings();
	
	@Query("SELECT T FROM ToppingsList T WHERE T.id =:id")
	public List getAllToppingsById(@Param ("id") Integer id);
	
	/*@Query("SELECT T FROM ToppingsList T WHERE T.user.userName =:userName")
	public List getAllItemsBYUserid(@Param ("userName") String userName);*/

}
