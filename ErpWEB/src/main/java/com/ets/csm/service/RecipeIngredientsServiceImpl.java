package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.RecipeIngredients;
import com.ets.csm.repository.RecipeIngredientsRepository;

@Service
public class RecipeIngredientsServiceImpl implements RecipeIngredientsService{

	
	@Autowired
	RecipeIngredientsRepository recipeIngredientsRepository;
	
	@Override
	public List getAllRecipeIngredients() {
		
		return recipeIngredientsRepository.getAllRecipeIngredients();
	}

	@Override
	public List getAllRecipeIngredientsBYid(Integer id) {
		
		return recipeIngredientsRepository.getAllRecipeIngredientsByid(id);
	}

	@Override
	public void saveRecipeIngredients(RecipeIngredients recIng) {
		recipeIngredientsRepository.save(recIng);
		
	}

	@Override
	public void removeRecipeIngredients(RecipeIngredients recIng) {
		recipeIngredientsRepository.delete(recIng);
		
	}

	@Override
	public List getAllRecipeIngredientsByRecipes(Integer recipeId) {
		
		return recipeIngredientsRepository.getAllRecipeIngredientsByRecipe(recipeId);
	}

}
