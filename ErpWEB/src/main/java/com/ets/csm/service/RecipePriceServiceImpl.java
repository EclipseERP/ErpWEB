package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.RecipePricing;
import com.ets.csm.repository.RecipePricingRepository;

@Service
public class RecipePriceServiceImpl implements RecipePriceService{

	@Autowired
	RecipePricingRepository recipePricingRepository;

	@Override
	public List getAllRecipePrice() {
		return recipePricingRepository.getAllRecipePrice();
	}

	@Override
	public List getAllRecipePriceByid(Integer id) {
		return recipePricingRepository.getAllRecipePriceByid(id);
	}

	@Override
	public void saveRecipePrice(RecipePricing rec) {
		recipePricingRepository.save(rec);
		
	}

	@Override
	public void removeRecipePrice(RecipePricing rec) {
		recipePricingRepository.delete(rec);
		
	}

	@Override
	public void saveOrUpdateRecipePrice(RecipePricing rec) {
		recipePricingRepository.save(rec);
		
	}

	@Override
	public List getRecipePriceBYAdmin() {
		return recipePricingRepository.getRecipePriceByAdmin();
	}
	
	
	
}
