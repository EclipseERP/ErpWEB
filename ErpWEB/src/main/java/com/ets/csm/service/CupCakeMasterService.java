package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.CupCakeMaster;


public interface CupCakeMasterService {
	
	
	public List getAllCupCakeMaster();
	 
	public List getAllCupCakeMasterBYid(Integer id);
	 
	public CupCakeMaster getallCupCakeMasterById(Integer id);

	public void saveCupCakeMaster(CupCakeMaster ccm);
	
	public void removeCupCakeMaster(CupCakeMaster ccm);

	public void saveOrUpdateCupCakeMaster(CupCakeMaster ccm);

	public List getCupCakesbyMaxId();
	

}
