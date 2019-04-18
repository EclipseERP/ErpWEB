package com.ets.csm.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.ets.csm.model.Adorn_Cat;


public interface Adorn_CatService {
	
	
	 public List getAllCategories();
	 
	 public List getAllCatBYid(Integer id);
	 
	 public Adorn_Cat getAdrCatBYid(Integer id);
	 
	 public List getAllCatBYUserid(String userName);

	public void saveCategory(Adorn_Cat cat);
	
	public void removeCategory(Adorn_Cat cat);

	public void saveOrUpdateCat(Adorn_Cat cat);
	 public List getItemListByCatID(Integer id);


}
