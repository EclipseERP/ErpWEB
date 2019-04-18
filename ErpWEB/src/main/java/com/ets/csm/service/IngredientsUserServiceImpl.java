package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.IngredientsUser;
import com.ets.csm.repository.IngredientsUserRepository;

@Service
public class IngredientsUserServiceImpl implements IngredientsUserService{
	
	@Autowired
	IngredientsUserRepository ingredientsUserRepository;

	@Override
	public List getAll() {
		
		return ingredientsUserRepository.getAllIngredientsUser();
	}

	@Override
	public List getAllBYid(Integer id) {
		
		return ingredientsUserRepository.getAllIngredientsUserByid(id);
	}

	@Override
	public IngredientsUser getallById(Integer id) {
		
		return ingredientsUserRepository.getIngredientsUserbyId(id);
	}

	@Override
	public List getAllBYUsername(String username) {
		
		return ingredientsUserRepository.getAllIngredientsUserByUsername(username);
	}

	@Override
	public void save(IngredientsUser ingu) {
		ingredientsUserRepository.save(ingu);
		
	}

	@Override
	public void remove(IngredientsUser ingu) {
		ingredientsUserRepository.delete(ingu);
		
	}

	@Override
	public void saveOrUpdate(IngredientsUser ingu) {
		ingredientsUserRepository.save(ingu);
		
	}

	@Override
	public List getIngredientsUserByMaxid() {
		
		return ingredientsUserRepository.getIngredientsUserByMaxid();
	}
	
	

}
