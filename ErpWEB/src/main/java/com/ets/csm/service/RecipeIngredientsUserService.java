package com.ets.csm.service;

import java.util.List;


import com.ets.csm.model.RecipeIngredientsUser;

public interface RecipeIngredientsUserService {
	
	public List getAllrecipeingredients();
	 
	public List getAllrecipeingredientsBYid(Integer id);
	
	public RecipeIngredientsUser getallrecipeingredientsById(Integer id);
	 
	public List getAllrecipeingredientsBYrecipeId(int recipeId);

	public void save(RecipeIngredientsUser recin);
	
	public void remove(RecipeIngredientsUser recin);

	public void saveOrUpdate(RecipeIngredientsUser recin);


}
