package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.IngredientsMaster;
import com.ets.csm.repository.IngredientsMasterRepository;

@Service
public class IngredientsMasterServiceImpl implements IngredientsMasterService{

	@Autowired
	IngredientsMasterRepository ingredientsMasterRepository;
	
	@Override
	public List getAllMaterialsMaster() {
		
		return ingredientsMasterRepository.getAllIngredientsMaster();
	}

	@Override
	public List getAllIngredientsMasterBYid(Integer id) {
		
		return ingredientsMasterRepository.getAllIngredientsMasterByid(id);
	}

	@Override
	public void saveIngredientsMaster(IngredientsMaster ing) {
		ingredientsMasterRepository.save(ing);
		
	}

	@Override
	public void removeIngredientsMaster(IngredientsMaster ing) {
		ingredientsMasterRepository.delete(ing);
		
	}

	@Override
	public void saveOrUpdateIngredientsMaster(IngredientsMaster ing) {
		ingredientsMasterRepository.save(ing);
		
	}

	@Override
	public IngredientsMaster getUserByIngrd(Integer id) {
		return ingredientsMasterRepository.getUserByIngrd(id);
	}

}
