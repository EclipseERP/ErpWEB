package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.RecipeIngredientsUser;

@Repository("recipeIngredientsUserRepository")
public interface RecipeIngredientsUserRepository extends JpaRepository<RecipeIngredientsUser, Integer>{
	
	@Query("SELECT RIU FROM RecipeIngredientsUser RIU")
	public List getAllRecipeIngredientsUser();
	
	@Query("SELECT RIU FROM RecipeIngredientsUser RIU WHERE RIU.id =:id")
	public List getAllRecipeIngredientsUserByid(@Param ("id") Integer id);
		
	@Query("SELECT RIU FROM RecipeIngredientsUser RIU WHERE RIU.id =:id")
	public RecipeIngredientsUser getRecipeIngredientsUserbyId(@Param ("id") Integer id);
	 
	@Query("SELECT RIU,RC,UN,ING FROM RecipeIngredientsUser RIU JOIN RIU.recipe RC JOIN RIU.unitId UN JOIN RIU.ingredient ING WHERE RIU.recipe.id =:recipeId")
	public List getAllRecipeIngredientsUserByRecipeId(@Param ("recipeId") Integer recipeId);
	

}
