package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.ToppingPricing;


public interface ToppingPricingService {
	
	public List getAllToppingPrice();
	 
	public List getAllToppingPriceByid(Integer id);
	 
	public void saveToppingPrice(ToppingPricing topr);
	
	public void removeToppingPrice(ToppingPricing topr);

	public void saveOrUpdateToppingPrice(ToppingPricing topr);

	public List getToppingPriceBYAdmin();
	 

}
