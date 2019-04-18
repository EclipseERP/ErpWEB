package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.IcingPricing;


public interface IcingPricingService {
	
	public List getAllIcingPricing();
	 
	public List getAllIcingPricingBYid(Integer id);
	 
	public void saveIcingPricing(IcingPricing icp);
	
	public void removeIcingPricing(IcingPricing icp);

	public void saveOrUpdateIcingPricing(IcingPricing icp);

	public List getAllIcingPricingBYUserId(String userName);
	

}
