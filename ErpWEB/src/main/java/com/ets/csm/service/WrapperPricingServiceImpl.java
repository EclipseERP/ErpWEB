package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.WrapperPricing;
import com.ets.csm.repository.WrapperPricingRepository;

@Service
public class WrapperPricingServiceImpl implements WrapperPricingService{
	
	@Autowired
	WrapperPricingRepository wrapperPricingRepository;

	@Override
	public List getAllWrapperPricing() {
		return wrapperPricingRepository.getAllWrapperPrice();
	}

	@Override
	public List getAllWrapperPricingByid(Integer id) {
		return wrapperPricingRepository.getAllWrapperPriceByid(id);
	}

	@Override
	public void saveWrapperPricing(WrapperPricing wrapr) {
		wrapperPricingRepository.save(wrapr);		
	}

	@Override
	public void removeWrapperPricing(WrapperPricing wrapr) {
		wrapperPricingRepository.delete(wrapr);		
	}

	@Override
	public void saveOrUpdateWrapperPricing(WrapperPricing wrapr) {
		wrapperPricingRepository.save(wrapr);
		
	}

	@Override
	public List getWrapperPricingBYAdmin() {
		return wrapperPricingRepository.getWrapperPriceByAdmin();
	}
	
	

}
