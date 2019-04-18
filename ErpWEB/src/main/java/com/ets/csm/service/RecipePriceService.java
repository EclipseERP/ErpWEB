package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.RecipePricing;

public interface RecipePriceService {

	
	public List getAllRecipePrice();
	 
	public List getAllRecipePriceByid(Integer id);
	 
	public void saveRecipePrice(RecipePricing rec);
	
	public void removeRecipePrice(RecipePricing rec);

	public void saveOrUpdateRecipePrice(RecipePricing rec);

	public List getRecipePriceBYAdmin();

	
}
