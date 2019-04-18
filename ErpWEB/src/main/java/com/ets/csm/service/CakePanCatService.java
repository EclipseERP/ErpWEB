package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.CakePanCategories;



public interface CakePanCatService {
	
	public List getAllCakePanCat();
	 
	public List getAllCakePanCatBYid(Integer id);
	
	public CakePanCategories getallCakePanCatById(Integer id);
	 
	public List getAllCakePanCatBYUserid(String userName);

	public void saveCakePanCat(CakePanCategories cpc);
	
	public void removeCakePanCat(CakePanCategories cpc);

	public CakePanCategories saveOrUpdateCakePanCat(CakePanCategories cpc);
	

}
