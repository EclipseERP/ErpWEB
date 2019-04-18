package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.MaterialsUser;

public interface MaterialUserService {
	
	public List getAllMaterialUser();
	 
	public List getAllMaterialUserBYid(Integer id);
	
	public MaterialsUser getallMaterialUserById(Integer id);
	 
	public List getAllMaterialUserBYUsername(String username);
	
	public List tierMaterialsUser(String username);

	public void saveMaterialUser(MaterialsUser mtu);
	
	public void removeMaterialUser(MaterialsUser mtu);

	public void saveOrUpdateMaterialUser(MaterialsUser mtu);

}
