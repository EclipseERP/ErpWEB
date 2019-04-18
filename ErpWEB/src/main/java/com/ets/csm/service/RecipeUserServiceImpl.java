package com.ets.csm.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.RecipeUser;
import com.ets.csm.repository.RecipeUserRepository;

@Service
public class RecipeUserServiceImpl implements RecipeUserService{

	@Autowired
	RecipeUserRepository recipeUserRepository;

	@Override
	public List getAllRecipeUser() {
		
		return recipeUserRepository.getAllRecipeUser();
	}

	@Override
	public List getAllRecipeUserBYid(Integer id) {
		
		return recipeUserRepository.getAllRecipeUserByid(id);
	}

	@Override
	public RecipeUser getRecipeUserById(Integer id) {
		
		return recipeUserRepository.getRecipeUser(id);
	}

	@Override
	public void saveRecipeUser(RecipeUser rcu) {
		recipeUserRepository.save(rcu);
		
	}

	@Override
	public void removeRecipeUser(RecipeUser rcu) {
		recipeUserRepository.delete(rcu);
		
	}

	@Override
	public void saveOrUpdateRecipeUser(RecipeUser rcu) {
		recipeUserRepository.save(rcu);
		
	}

	@Override
	public List getRecipeUserByMaxid() {
		
		return recipeUserRepository.getRecipeUserByMaxid();
	}

	@Override
	public List getAllRecipeUserByUserName(String username) {
		
		return recipeUserRepository.getAllRecipeUserByUsername(username);
	}
	
	

}
