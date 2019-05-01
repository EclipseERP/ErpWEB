package com.ets.csm.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.ets.csm.model.Items;

public interface ItemRepository extends JpaRepository<Items, Integer> {
	
	@Query("SELECT I from Items I order by I.id")
	public List getAllItems();
	
	@Query("SELECT I FROM Items I WHERE I.id =:id")
	public List getAllItemsByID(@Param ("id") Integer id);


}
