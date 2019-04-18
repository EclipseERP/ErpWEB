package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.MaterialCategories;
import com.ets.csm.repository.MaterialCategoriesRepository;

@Service
public class MaterialCategoriesServiceImpl implements MaterialCategoriesService{
	
	@Autowired
	MaterialCategoriesRepository materialCategoriesRepository;

	@Override
	public List getAllMaterialUser() {
		
		return materialCategoriesRepository.getAllMaterialCategories();
	}

	@Override
	public List getAllMaterialUserBYid(Integer id) {
		
		return materialCategoriesRepository.getAllMaterialCategoriesByid(id);
	}

	@Override
	public MaterialCategories getallMaterialUserById(Integer id) {
		
		return materialCategoriesRepository.getallMaterialCategoriesById(id);
	}

	@Override
	public List getAllMaterialUserBYUsername(String username) {
		
		return materialCategoriesRepository.getAllMaterialCategoriesByUsername(username);
	}

	@Override
	public void saveMaterialUser(MaterialCategories mcu) {
		materialCategoriesRepository.save(mcu);
		
	}

	@Override
	public void removeMaterialUser(MaterialCategories mcu) {
		materialCategoriesRepository.delete(mcu);
		
	}

	@Override
	public void saveOrUpdateMaterialUser(MaterialCategories mcu) {
		materialCategoriesRepository.save(mcu);
		
	}
	
}
