package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.CupCakeFillingPrice;


public interface CpCkFillingPriceUserService {
	
	public List getAllCpCkFillingPrice();
	 
	public List getAllCpCkFillingPriceBYid(Integer id);
	
	public CupCakeFillingPrice getallCpCkFillingPriceById(Integer id);
	 
	public void saveCpCkFillingPrice(CupCakeFillingPrice cfp);
	
	public void removeCpCkFillingPrice(CupCakeFillingPrice cfp);

	public void saveOrUpdateCpCkFillingPrice(CupCakeFillingPrice cfp);

	public List getAllCpCkFillingPriceBYUserId(String userName);
	

}
