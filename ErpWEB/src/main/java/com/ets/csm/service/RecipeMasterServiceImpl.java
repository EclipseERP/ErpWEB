package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.RecipeMaster;
import com.ets.csm.repository.RecipeMasterRepository;

@Service
public class RecipeMasterServiceImpl implements RecipeMasterService{

	@Autowired
	RecipeMasterRepository recipeMasterRepository;
	
	@Override
	public List getAllRecipeMaster() {
		return recipeMasterRepository.getAllRecipeMaster();
	}

	@Override
	public List getAllRecipeMasterBYid(Integer id) {
		return recipeMasterRepository.getAllRecipeMasterByid(id);
	}
	
	@Override
	public RecipeMaster getRecipe(Integer id) {
		return recipeMasterRepository.getRecipe(id);
	}

	@Override
	public void saveRecipeMaster(RecipeMaster rcm) {
		recipeMasterRepository.save(rcm);		
	}

	@Override
	public void removeRecipeMaster(RecipeMaster rcm) {
		recipeMasterRepository.delete(rcm);
		
	}

	@Override
	public void saveOrUpdateRecipeMaster(RecipeMaster rcm) {
		recipeMasterRepository.save(rcm);		
	}

	/*@Override
	public List getAllRecipeMasterByIngredients() {
		
		//System.out.println("gfytytdytdcytvyv"+recipeMasterRepository.getAllRecipeMasterByIngredient());
		return recipeMasterRepository.getAllRecipeMasterByIngredient();
	}*/
	
	@Override
	public List getRecipeByMaxid(){
		return recipeMasterRepository.getRecipeByMaxid();
	}

}
