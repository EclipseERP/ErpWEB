package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.Adorn_Item;

public interface Adorn_ItemService {

	
	public List getAllItem();
	 
	public List getAllItemsBYid(Integer id);
	 
	public List getAllItemsBYUserid(String userName);

	public void saveItem(Adorn_Item item);
	
	public void removeItem(Adorn_Item item);

	public void saveOrUpdateItem(Adorn_Item cat);
	
	
	

	 
	
	
}
