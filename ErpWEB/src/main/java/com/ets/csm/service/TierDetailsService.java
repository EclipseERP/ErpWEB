package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.TierDetails;

public interface TierDetailsService {
	
	public List getAllTierDetails();
	 
	public List getAllTierDetailsBYid(Integer id);
	
	public TierDetails getallTierDetailsById(Integer id);
	
	public List getTierDetailsByCake(Integer id);
	
	public List getTierDetailsPriceByCake(Integer id);
	 
	public void saveTierDetails(TierDetails td);
	
	public void removeTierDetails(TierDetails td);

	public void saveOrUpdateTierDetails(TierDetails td);
	

}
