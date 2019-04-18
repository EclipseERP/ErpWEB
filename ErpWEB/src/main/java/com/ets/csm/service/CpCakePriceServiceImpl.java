package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CupCake;
import com.ets.csm.model.CupCakePricing;
import com.ets.csm.repository.CpCakePricingRepository;
import com.ets.csm.repository.CupCakeRepository;

@Service
public class CpCakePriceServiceImpl implements CpCakePriceService{
	
	@Autowired
	CpCakePricingRepository cpCakePricingRepository;

	@Autowired
	CupCakeRepository cupcakeRepository;
	

	
	@Override
	public List getAllCupCakeSize() {
		return cpCakePricingRepository.getAllCupCakesize();
	}

	@Override
	public List getAllCupCakeSizeBYid(Integer id) {
		return cpCakePricingRepository.getAllCupCakesizeid(id);
	}

	@Override
	public void saveCupCakeSize(CupCakePricing cup) {
		cpCakePricingRepository.save(cup);		
	}

	@Override
	public void removeCupCakeSize(CupCakePricing cup) {
		cpCakePricingRepository.delete(cup);
		
	}

	@Override
	public void saveOrUpdateCupCakeSize(CupCakePricing cup) {
		cpCakePricingRepository.save(cup);		
	}

	@Override
	public List getCupCakesBYAdmin() {
		return cpCakePricingRepository.getCupCakesBYAdmin();
	}

	@Override
	public void saveOrUpdate(CupCake cupcake) {
		// TODO Auto-generated method stub
		 cupcakeRepository.save(cupcake);
	}
	
	@Override
	public List getAllCupCakeDetailsByID(Integer id)
	{
		return cupcakeRepository.getAllupCakeByidWithoutJoining(id);
	}
	

}
