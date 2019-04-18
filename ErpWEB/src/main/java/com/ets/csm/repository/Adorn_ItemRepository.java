package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Adorn_Item;

@Repository("adorn_ItemRepository")
public interface Adorn_ItemRepository extends JpaRepository<Adorn_Item, Integer>{

	
	@Query("SELECT I FROM Adorn_Item I order by I.id desc")
	public List getAllItems();
	
	@Query("SELECT I FROM Adorn_Item I WHERE I.id =:id")
	public List getAllItemsBYid(@Param ("id") Integer id);
	
	@Query("SELECT I,ADRCAT FROM Adorn_Item I LEFT JOIN I.adorn_Cat ADRCAT WHERE I.user.userName =:userName")
	public List getAllItemsBYUserid(@Param ("userName") String userName);
	
	@Query("SELECT ITEM FROM Adorn_Item ITEM LEFT JOIN ITEM.adorn_Cat CAT WHERE ITEM.adorn_Cat.id=:id")
	public List getAllItemsByCategoryID(@Param("id") Integer id);
}
