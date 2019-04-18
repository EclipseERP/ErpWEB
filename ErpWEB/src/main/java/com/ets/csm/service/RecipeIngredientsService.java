package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.RecipeIngredients;


public interface RecipeIngredientsService {
	
	public List getAllRecipeIngredients();
	 
	public List getAllRecipeIngredientsBYid(Integer id);
	
	public List getAllRecipeIngredientsByRecipes(Integer recipeId);
	 
	public void saveRecipeIngredients(RecipeIngredients recIng);
	
	public void removeRecipeIngredients(RecipeIngredients recIng);
	

}
