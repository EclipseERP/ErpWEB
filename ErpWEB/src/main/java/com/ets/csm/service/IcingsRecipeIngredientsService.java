package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.IcingsRecipeIngredients;

public interface IcingsRecipeIngredientsService {
	
	public List getIcingsRecipeIngredients();
	 
	public List getIcingsRecipeIngredientsBYid(Integer id);
	
	public List getIcingsRecipeIngredientsByIcing(Integer icingId);
	 
	public void saveIcingsRecipeIngredients(IcingsRecipeIngredients icrping);
	
	public void removeIcingsRecipeIngredients(IcingsRecipeIngredients icrping);
	

}
