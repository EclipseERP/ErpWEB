package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.FillingIngredientsUser;

public interface FillingsIngredientUserService {
	
	public List getAllfillingingredients();
	 
	public List getAllfillingingredientsBYid(Integer id);
	
	public FillingIngredientsUser getallfillingingredientsById(Integer id);
	 
	public List getAllfillingingredientsBYfillingId(int fillingId);

	public void save(FillingIngredientsUser fillin);
	
	public void remove(FillingIngredientsUser fillin);

	public void saveOrUpdate(FillingIngredientsUser fillin);
	

}
