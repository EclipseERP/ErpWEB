package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.IcingsRecipeIngredients;
import com.ets.csm.repository.IcingsRecipeIngredientsRepository;

@Service
public class IcingsRecipeIngredientsServiceImpl implements IcingsRecipeIngredientsService{
	
	@Autowired
	IcingsRecipeIngredientsRepository icingsRecipeIngredientsRepository;

	@Override
	public List getIcingsRecipeIngredients() {
		
		return icingsRecipeIngredientsRepository.getIcingsRecipeIngredients();
	}

	@Override
	public List getIcingsRecipeIngredientsBYid(Integer id) {
		
		return icingsRecipeIngredientsRepository.getIcingsRecipeIngredientsByid(id);
	}

	@Override
	public List getIcingsRecipeIngredientsByIcing(Integer icingId) {
	
		return icingsRecipeIngredientsRepository.getIcingRecipeIngrdByRecipe(icingId);
	}

	@Override
	public void saveIcingsRecipeIngredients(IcingsRecipeIngredients icrping) {
		icingsRecipeIngredientsRepository.save(icrping);
		
	}

	@Override
	public void removeIcingsRecipeIngredients(IcingsRecipeIngredients icrping) {
		icingsRecipeIngredientsRepository.delete(icrping);
		
	}

}
