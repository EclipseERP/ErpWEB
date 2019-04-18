package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.ToppingPricing;
import com.ets.csm.repository.ToppingPricingRepository;


@Service
public class ToppingPricingServiceImpl implements ToppingPricingService{

	@Autowired
	ToppingPricingRepository toppingPricingRepository;
	
	@Override
	public List getAllToppingPrice() {
		return toppingPricingRepository.getAllToppingPrice();
	}

	@Override
	public List getAllToppingPriceByid(Integer id) {
	
		return toppingPricingRepository.getAllToppingPriceByid(id);
	}

	@Override
	public void saveToppingPrice(ToppingPricing topr) {
		toppingPricingRepository.save(topr);
		
	}

	@Override
	public void removeToppingPrice(ToppingPricing topr) {
		toppingPricingRepository.delete(topr);		
	}

	@Override
	public void saveOrUpdateToppingPrice(ToppingPricing topr) {
		toppingPricingRepository.save(topr);	
	}

	@Override
	public List getToppingPriceBYAdmin() {
		
		return toppingPricingRepository.getToppingPriceByAdmin();
	}

}
