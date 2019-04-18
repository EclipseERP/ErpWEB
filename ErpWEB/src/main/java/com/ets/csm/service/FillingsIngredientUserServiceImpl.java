package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.FillingIngredientsUser;
import com.ets.csm.repository.FillingIngredientsUserRepository;

@Service
public class FillingsIngredientUserServiceImpl implements FillingsIngredientUserService{
	
	@Autowired
	FillingIngredientsUserRepository fillingIngredientsUserRepository;

	@Override
	public List getAllfillingingredients() {
		
		return fillingIngredientsUserRepository.getAllFillingIngredientsUser();
	}

	@Override
	public List getAllfillingingredientsBYid(Integer id) {
		
		return fillingIngredientsUserRepository.getAllFillingIngredientsUserByid(id);
	}

	@Override
	public FillingIngredientsUser getallfillingingredientsById(Integer id) {
		
		return fillingIngredientsUserRepository.getFillingIngredientsUserbyId(id);
	}

	@Override
	public List getAllfillingingredientsBYfillingId(int fillingId) {
		
		return fillingIngredientsUserRepository.getAllFillingIngredientsUserByFillingId(fillingId);
	}

	@Override
	public void save(FillingIngredientsUser fillin) {
		fillingIngredientsUserRepository.save(fillin);
		
	}

	@Override
	public void remove(FillingIngredientsUser fillin) {
		fillingIngredientsUserRepository.delete(fillin);
		
	}

	@Override
	public void saveOrUpdate(FillingIngredientsUser fillin) {
		fillingIngredientsUserRepository.save(fillin);
		
	}
	
	

}
