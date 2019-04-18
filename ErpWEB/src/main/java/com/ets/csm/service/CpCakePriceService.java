package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.CupCake;
import com.ets.csm.model.CupCakePricing;

public interface CpCakePriceService {

	public List getAllCupCakeSize();
	 
	public List getAllCupCakeSizeBYid(Integer id);
	 

	public void saveCupCakeSize(CupCakePricing cup);
	
	public void removeCupCakeSize(CupCakePricing cup);

	public void saveOrUpdateCupCakeSize(CupCakePricing cup);
	
	public void saveOrUpdate(CupCake cupcake);

	public List getCupCakesBYAdmin();
	
	public List getAllCupCakeDetailsByID(Integer id);
}
