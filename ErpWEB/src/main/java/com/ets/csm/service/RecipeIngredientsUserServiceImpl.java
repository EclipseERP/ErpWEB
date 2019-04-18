package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.RecipeIngredientsUser;
import com.ets.csm.repository.RecipeIngredientsUserRepository;

@Service
public class RecipeIngredientsUserServiceImpl implements RecipeIngredientsUserService{
	
	@Autowired
	RecipeIngredientsUserRepository recipeIngredientsUserRepository;

	@Override
	public List getAllrecipeingredients() {
		
		return recipeIngredientsUserRepository.getAllRecipeIngredientsUser();
	}

	@Override
	public List getAllrecipeingredientsBYid(Integer id) {
		
		return recipeIngredientsUserRepository.getAllRecipeIngredientsUserByid(id);
	}

	@Override
	public RecipeIngredientsUser getallrecipeingredientsById(Integer id) {
		
		return recipeIngredientsUserRepository.getOne(id);
	}

	@Override
	public List getAllrecipeingredientsBYrecipeId(int recipeId) {
		
		return recipeIngredientsUserRepository.getAllRecipeIngredientsUserByRecipeId(recipeId);
	}

	@Override
	public void save(RecipeIngredientsUser recin) {
		recipeIngredientsUserRepository.save(recin);
		
	}

	@Override
	public void remove(RecipeIngredientsUser recin) {
		recipeIngredientsUserRepository.delete(recin);
		
	}

	@Override
	public void saveOrUpdate(RecipeIngredientsUser recin) {
		recipeIngredientsUserRepository.save(recin);
		
	}
	
	
}
