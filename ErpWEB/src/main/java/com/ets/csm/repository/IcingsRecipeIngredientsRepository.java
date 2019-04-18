package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.IcingsRecipeIngredients;

@Repository("icingsRecipeIngredientsRepository")
public interface IcingsRecipeIngredientsRepository extends JpaRepository<IcingsRecipeIngredients, Integer>{
	
	@Query("SELECT IR FROM IcingsRecipeIngredients IR")
	public List getIcingsRecipeIngredients();
	
	@Query("SELECT IR FROM IcingsRecipeIngredients IR WHERE IR.id =:id")
	public List getIcingsRecipeIngredientsByid(@Param ("id") Integer id);
	 
	@Query("SELECT IR, IM, ICM, U FROM IcingsRecipeIngredients IR JOIN IR.icingsMaster ICM JOIN IR.ingredientsMaster IM JOIN IR.unit U  WHERE ICM.id =:icingId")
	public List getIcingRecipeIngrdByRecipe(@Param ("icingId") Integer icingId);


}
