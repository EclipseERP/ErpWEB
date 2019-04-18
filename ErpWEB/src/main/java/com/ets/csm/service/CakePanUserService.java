package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.CakePansUser;

public interface CakePanUserService {

	
	public List getAllCakePanUser();
	 
	public List getAllCakePanUserBYid(Integer id);
	
	public CakePansUser getallCakePanUserById(Integer id);
	
	public List getCkPansBYUserid(String userName);
	 
	public List getCkPansBYCategoryid(Integer categoryId, String userName);
	
	public void saveCakePanUser(CakePansUser cpm);
	
	public void removeCakePanUser(CakePansUser cpm);

	public void saveOrUpdateCakePanUser(CakePansUser cpm);
	
}
