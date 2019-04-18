package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.MaterialCategories;

public interface MaterialCategoriesService {

	
	public List getAllMaterialUser();
	 
	public List getAllMaterialUserBYid(Integer id);
	
	public MaterialCategories getallMaterialUserById(Integer id);
	 
	public List getAllMaterialUserBYUsername(String username);

	public void saveMaterialUser(MaterialCategories mcu);
	
	public void removeMaterialUser(MaterialCategories mcu);

	public void saveOrUpdateMaterialUser(MaterialCategories mcu);
	
}
