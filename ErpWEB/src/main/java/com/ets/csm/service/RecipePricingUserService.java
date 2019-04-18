package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.RecipePricingUser;

public interface RecipePricingUserService {
	
	public List getAllRecipePriceUser();
	 
	public List getAllRecipePriceUserBYid(Integer id);
	 
	public void saveRecipePriceUser(RecipePricingUser rpu);
	
	public void removeRecipePriceUser(RecipePricingUser rpu);

	public void saveOrUpdateRecipePriceUser(RecipePricingUser rpu);

	public List getAllRecipePriceUserBYUserId(String userName);

}
