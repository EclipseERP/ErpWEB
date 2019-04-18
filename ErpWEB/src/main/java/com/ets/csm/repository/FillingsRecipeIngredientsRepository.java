package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ets.csm.model.FillingRecipeIngredients;


@Repository ("fillingRecipeIngredientsRepositoy")
public interface FillingsRecipeIngredientsRepository extends JpaRepository<FillingRecipeIngredients, Integer>{
	
	@Query("SELECT RI FROM FillingRecipeIngredients RI")
	public List getFillingsRecipeIngredients();
	
	@Query("SELECT RI FROM FillingRecipeIngredients RI WHERE RI.id =:id")
	public List getFillingsRecipeIngredientsByid(@Param ("id") Integer id);
	 
	@Query("SELECT RI, IM, RM, U FROM FillingRecipeIngredients RI JOIN RI.fillingRecipeMaster RM JOIN RI.ingredientsMaster IM JOIN RI.unit U  WHERE RM.id =:recipeId")
	public List getFillingRecipeIngrdByRecipe(@Param ("recipeId") Integer recipeId);
	
}
