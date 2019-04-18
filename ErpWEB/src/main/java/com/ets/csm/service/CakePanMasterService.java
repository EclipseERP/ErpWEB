package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.CakePansMaster;

public interface CakePanMasterService {

	
	public List getAllCakePanMaster();
	 
	public List getAllCakePanMasterBYid(Integer id);
	 
	public void saveCakePanMaster(CakePansMaster cpm);
	
	public void removeCakePanMaster(CakePansMaster cpm);

	public void saveOrUpdateCakePanMaster(CakePansMaster cpm);
	
}
