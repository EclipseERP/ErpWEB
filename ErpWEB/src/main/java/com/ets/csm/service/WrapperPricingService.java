package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.WrapperPricing;

public interface WrapperPricingService {

	
	public List getAllWrapperPricing();
	 
	public List getAllWrapperPricingByid(Integer id);
	 
	public void saveWrapperPricing(WrapperPricing wrapr);
	
	public void removeWrapperPricing(WrapperPricing wrapr);

	public void saveOrUpdateWrapperPricing(WrapperPricing wrapr);

	public List getWrapperPricingBYAdmin();
	 
}
