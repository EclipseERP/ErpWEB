package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.FillingsPricing;



public interface FillingsPricingService {
	
	public List getAllFillingPrice();
	 
	public List getAllFillingPriceByid(Integer id);
	 
	public void saveFillingPrice(FillingsPricing fill);
	
	public void removeFillingPrice(FillingsPricing fill);

	public void saveOrUpdateFillingPrice(FillingsPricing fill);

	public List getFillingPriceBYAdmin();
	

}
