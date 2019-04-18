package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.MaterialsMaster;



public interface MaterialsMasterService {

	
	public List getAllMaterialsMaster();
	 
	public List getAllMaterialsMasterBYid(Integer id);
	 
	public void saveMaterialsMaster(MaterialsMaster mat);
	
	public void removeCakePanMaster(MaterialsMaster mat);

	public void saveOrUpdateMaterialsMaster(MaterialsMaster mat);
	
}
