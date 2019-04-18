package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.RecipeMaster;

public interface RecipeMasterService {
	
	public List getAllRecipeMaster();
	 
	public List getAllRecipeMasterBYid(Integer id);
	
	public RecipeMaster getRecipe(Integer id);
	
	//public List getAllRecipeMasterByIngredients();
	 
	public void saveRecipeMaster(RecipeMaster rcm);
	
	public void removeRecipeMaster(RecipeMaster rcm);

	public void saveOrUpdateRecipeMaster(RecipeMaster rcm);
	
	public List getRecipeByMaxid();

}
