package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ets.csm.model.RecipeIngredients;

@Repository ("recipeIngredientsRepositoy")
public interface RecipeIngredientsRepository extends JpaRepository<RecipeIngredients, Integer>{
	
	@Query("SELECT RI FROM RecipeIngredients RI")
	public List getAllRecipeIngredients();
	
	@Query("SELECT RI FROM RecipeIngredients RI WHERE RI.id =:id")
	public List getAllRecipeIngredientsByid(@Param ("id") Integer id);
	 
	@Query("SELECT RI, IM, RM, U FROM RecipeIngredients RI JOIN RI.recipe RM JOIN RI.ingredientsId IM JOIN RI.unitId U  WHERE RM.id =:recipeId")
	public List getAllRecipeIngredientsByRecipe(@Param ("recipeId") Integer recipeId);
	
	

}
