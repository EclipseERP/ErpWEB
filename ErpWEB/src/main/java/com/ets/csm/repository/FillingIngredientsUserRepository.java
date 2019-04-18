package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.FillingIngredientsUser;


@Repository("fillingIngredientsRepository")
public interface FillingIngredientsUserRepository extends JpaRepository<FillingIngredientsUser, Integer>{
	
	@Query("SELECT FIU FROM FillingIngredientsUser FIU")
	public List getAllFillingIngredientsUser();
	
	@Query("SELECT FIU FROM FillingIngredientsUser FIU WHERE FIU.id =:id")
	public List getAllFillingIngredientsUserByid(@Param ("id") Integer id);
		
	@Query("SELECT FIU FROM FillingIngredientsUser FIU WHERE FIU.id =:id")
	public FillingIngredientsUser getFillingIngredientsUserbyId(@Param ("id") Integer id);
	 
	@Query("SELECT FIU,FL,UN,ING FROM FillingIngredientsUser FIU JOIN FIU.filling FL JOIN FIU.unitId UN JOIN FIU.ingredient ING WHERE FIU.filling.id =:fillingId")
	public List getAllFillingIngredientsUserByFillingId(@Param ("fillingId") Integer fillingId);
	

}
