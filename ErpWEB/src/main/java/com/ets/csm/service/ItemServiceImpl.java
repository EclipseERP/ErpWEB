package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ets.csm.repository.ItemRepository;

public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemrepo;
	
	@Override
	public List getAllItems() {
		
		return itemrepo.getAllItems();
	}

	@Override
	public List getAllItemsByID(int id) {
		return itemrepo.getAllItemsByID(id);
	}

}
