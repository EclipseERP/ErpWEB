package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.IcingsMaster;


public interface IcingsMasterService {
	
	public List getAllIcingsMaster();
	 
	public List getAllIcingsMasterBYid(Integer id);
	
	public IcingsMaster getIcingsMasterbyId(Integer id);
	
	//public List getAllIcingsMasterByIngredients();
	 
	public void saveIcingsMaster(IcingsMaster icm);
	
	public void removeIcingsMaster(IcingsMaster icm);

	public void saveOrUpdateIcingsMaster(IcingsMaster icm);
	
	public List getIcingsMasterByMaxid();
	

}
