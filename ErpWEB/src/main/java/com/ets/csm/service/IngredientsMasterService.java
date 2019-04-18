package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.IngredientsMaster;

public interface IngredientsMasterService {
	
	public List getAllMaterialsMaster();
	 
	public List getAllIngredientsMasterBYid(Integer id);
	
	public IngredientsMaster getUserByIngrd(Integer id);
	 
	public void saveIngredientsMaster(IngredientsMaster ing);
	
	public void removeIngredientsMaster(IngredientsMaster ing);

	public void saveOrUpdateIngredientsMaster(IngredientsMaster ing);
	 

}
