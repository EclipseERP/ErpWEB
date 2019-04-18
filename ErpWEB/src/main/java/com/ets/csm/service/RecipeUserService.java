package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.RecipeUser;

public interface RecipeUserService {
	
	public List getAllRecipeUser();
	 
	public List getAllRecipeUserBYid(Integer id);
	
	public RecipeUser getRecipeUserById(Integer id);
	
	public List getAllRecipeUserByUserName(String username);
	 
	public void saveRecipeUser(RecipeUser rcu);
	
	public void removeRecipeUser(RecipeUser rcu);

	public void saveOrUpdateRecipeUser(RecipeUser rcu);
	
	public List getRecipeUserByMaxid();
	

}
