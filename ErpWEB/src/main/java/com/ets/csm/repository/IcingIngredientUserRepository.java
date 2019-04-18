package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.IcingIngredientUser;

@Repository("icingIngredientUserReposirtoy")
public interface IcingIngredientUserRepository extends JpaRepository<IcingIngredientUser, Integer>{
	
	@Query("SELECT IIU FROM IcingIngredientUser IIU")
	public List getAllIcingIngredientUser();
	
	@Query("SELECT IIU FROM IcingIngredientUser IIU WHERE IIU.id =:id")
	public List getAllIcingIngredientUserByid(@Param ("id") Integer id);
		
	@Query("SELECT IIU FROM IcingIngredientUser IIU WHERE IIU.id =:id")
	public IcingIngredientUser getIcingIngredientUserbyId(@Param ("id") Integer id);
	 
	@Query("SELECT IIU,ICU,UN,ING FROM IcingIngredientUser IIU JOIN IIU.icing ICU JOIN IIU.unitId UN JOIN IIU.ingredient ING WHERE IIU.icing.id =:icingId")
	public List getAllIcingIngredientUserByIcingId(@Param ("icingId") Integer icingId);
	

}
