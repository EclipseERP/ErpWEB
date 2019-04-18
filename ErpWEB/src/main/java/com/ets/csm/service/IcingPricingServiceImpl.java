package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.IcingPricing;
import com.ets.csm.repository.IcingPricingRepository;

@Service
public class IcingPricingServiceImpl implements IcingPricingService{

	@Autowired
	IcingPricingRepository icingPricingRepository;
	
	@Override
	public List getAllIcingPricing() {


		return icingPricingRepository.getAllIcingPricingUser();
	}

	@Override
	public List getAllIcingPricingBYid(Integer id) {
		
		return icingPricingRepository.getAllIcingPricingUserByid(id);
	}

	@Override
	public void saveIcingPricing(IcingPricing icp) {
		icingPricingRepository.save(icp);
		
	}

	@Override
	public void removeIcingPricing(IcingPricing icp) {
		icingPricingRepository.delete(icp);
		
	}

	@Override
	public void saveOrUpdateIcingPricing(IcingPricing icp) {
		icingPricingRepository.save(icp);
		
	}

	@Override
	public List getAllIcingPricingBYUserId(String userName) {
		
		return icingPricingRepository.getAllIcingPricingUserBYUserid(userName);
	}
	

}
