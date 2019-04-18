package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.CupCake;

public interface CupCakeService {

	public List getAllCupCake();
	 
	public List getAllCupCakeBYid(Integer id);
	
	public CupCake getAllCupCakeById(Integer id);
	
	public List getAllCupCakeBYUsername(String username);

	public CupCake getCupCakeByMaxid();
	
	public void saveCupCake(CupCake cpCk);
	
	public void removeCupCake(CupCake cpCk);

	public void saveOrUpdateCupCake(CupCake cpCk);
	
}
