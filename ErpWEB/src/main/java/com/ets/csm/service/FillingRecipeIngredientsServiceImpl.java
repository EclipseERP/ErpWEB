package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ets.csm.model.FillingRecipeIngredients;
import com.ets.csm.repository.FillingsRecipeIngredientsRepository;

@Service
public class FillingRecipeIngredientsServiceImpl implements FillingRecipeIngredientsService{

	
	@Autowired
	FillingsRecipeIngredientsRepository fillingRecipeIngredientsRepository;
	


	@Override
	public List getFillingsRecipeIngredients() {
		return fillingRecipeIngredientsRepository.getFillingsRecipeIngredients();
	}

	@Override
	public List getFillingsRecipeIngredientsBYid(Integer id) {
		return fillingRecipeIngredientsRepository.getFillingsRecipeIngredientsByid(id);
	}

	@Override
	public List getFillingRecipeIngrdByRecipe(Integer recipeId) {
		return fillingRecipeIngredientsRepository.getFillingRecipeIngrdByRecipe(recipeId);
	}

	@Override
	public void saveFillingRecipeIngredients(FillingRecipeIngredients recIng) {
		fillingRecipeIngredientsRepository.save(recIng);
	}

	@Override
	public void removeFillingRecipeIngredients(FillingRecipeIngredients recIng) {
		fillingRecipeIngredientsRepository.delete(recIng);
	}

}
