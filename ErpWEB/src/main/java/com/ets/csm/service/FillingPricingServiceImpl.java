package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.FillingsPricing;
import com.ets.csm.repository.FillingRepository;

@Service
public class FillingPricingServiceImpl implements FillingsPricingService{
	
	@Autowired
	FillingRepository  fillingRepository;

	@Override
	public List getAllFillingPrice() {
		return fillingRepository.getAllFillingPrice();
	}

	@Override
	public List getAllFillingPriceByid(Integer id) {
		return fillingRepository.getAllFillingPriceByid(id);
	}

	@Override
	public void saveFillingPrice(FillingsPricing fill) {
		fillingRepository.save(fill);
		
	}

	@Override
	public void removeFillingPrice(FillingsPricing fill) {
		fillingRepository.deleteAll();
		
	}

	@Override
	public void saveOrUpdateFillingPrice(FillingsPricing fill) {
		fillingRepository.save(fill);
		
	}

	@Override
	public List getFillingPriceBYAdmin() {
		return fillingRepository.getFillingByAdmin();
	}
	

}
