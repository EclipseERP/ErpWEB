package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Adorn_Cat;
import com.ets.csm.repository.Adorn_CatRepository;
import com.ets.csm.repository.Adorn_ItemRepository;

@Service
public class Adorn_CatServiceImpl implements Adorn_CatService {

	@Autowired
	private Adorn_CatRepository adorn_CatRepository;
	
	@Autowired 
	private Adorn_ItemRepository adorn_ItemRepository;
	
	@Override
	public List getAllCategories() {
		return adorn_CatRepository.getAllCatagories();
	}

	@Override
	public List getAllCatBYid(Integer id) {
		return adorn_CatRepository.getAllCategoriesBYid(id);
	}

	@Override
	public List getAllCatBYUserid(String userName) {
		return adorn_CatRepository.getAllCategoriesBYUserid(userName);
	}

	@Override
	public void saveCategory(Adorn_Cat cat) {
		adorn_CatRepository.save(cat);
	}

	@Override
	public void removeCategory(Adorn_Cat cat) {
		adorn_CatRepository.delete(cat);	
	}

	@Override
	public void saveOrUpdateCat(Adorn_Cat cat) {
		adorn_CatRepository.save(cat);
		
	}

	@Override
	public Adorn_Cat getAdrCatBYid(Integer id) {
		
		return adorn_CatRepository.getAdrCatBYid(id);
	}
	
   @Override
   public List getItemListByCatID(Integer id)
   {
	   return adorn_ItemRepository.getAllItemsByCategoryID(id);
   }


}
