package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Adorn_Item;
import com.ets.csm.repository.Adorn_ItemRepository;

@Service
public class Adorn_ItemServiceImpl implements Adorn_ItemService{
	
	@Autowired
	private Adorn_ItemRepository adorn_ItemRepository;

	@Override
	public List getAllItem() {
		
		return adorn_ItemRepository.getAllItems();
	}

	@Override
	public List getAllItemsBYid(Integer id) {
		
		return adorn_ItemRepository.getAllItemsBYid(id);
	}

	@Override
	public List getAllItemsBYUserid(String userName) {

		return adorn_ItemRepository.getAllItemsBYUserid(userName);
	}

	@Override
	public void saveItem(Adorn_Item item) {
		adorn_ItemRepository.save(item);
		
	}

	@Override
	public void removeItem(Adorn_Item item) {
		adorn_ItemRepository.delete(item);
		
	}

	@Override
	public void saveOrUpdateItem(Adorn_Item item) {
		adorn_ItemRepository.save(item);
		
	}

}
