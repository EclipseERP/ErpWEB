package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CakePanCategories;
import com.ets.csm.repository.CakePanCatRepository;

@Service
public class CakePanCatServiceImpl implements CakePanCatService{

	@Autowired
	CakePanCatRepository cakePanCatRepository;
	
	@Override
	public List getAllCakePanCat() {
		
		return cakePanCatRepository.getAllCakePanCategories();
	}

	/*@Override
	public List getAllCakePanCatBYid(Integer id) {
		
		return cakePanCatRepository.getAllCakePanCategoriesBYid(id);
	}*/

	@Override
	public void saveCakePanCat(CakePanCategories cpc) {
		cakePanCatRepository.save(cpc);
		
	}

	@Override
	public void removeCakePanCat(CakePanCategories cpc) {
		cakePanCatRepository.delete(cpc);		
	}

	@Override
	public CakePanCategories saveOrUpdateCakePanCat(CakePanCategories cpc) {
		
		return cakePanCatRepository.save(cpc);
	}

	@Override
	public List getAllCakePanCatBYid(Integer id) {
		
		return cakePanCatRepository.getAllCakePanCategoriesBYid(id);
	}

	@Override
	public List getAllCakePanCatBYUserid(String userName) {
		
		return cakePanCatRepository.getAllCakePanCategoriesBYUserid(userName);
	}

	@Override
	public CakePanCategories getallCakePanCatById(Integer id) {
		
		return cakePanCatRepository.getallCakePanCategoriesById(id);
	}

}
