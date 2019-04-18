package com.ets.csm.service;

import java.util.List;
import com.ets.csm.model.FillingRecipeIngredients;

public interface FillingRecipeIngredientsService {
	
	public List getFillingsRecipeIngredients();
	 
	public List getFillingsRecipeIngredientsBYid(Integer id);
	
	public List getFillingRecipeIngrdByRecipe(Integer recipeId);
	 
	public void saveFillingRecipeIngredients(FillingRecipeIngredients recIng);
	
	public void removeFillingRecipeIngredients(FillingRecipeIngredients recIng);
	

}
