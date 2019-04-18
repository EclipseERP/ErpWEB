package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.IngredientsUser;

public interface IngredientsUserService {
	
	 public List getAll();
	 
	public List getAllBYid(Integer id);
	
	public IngredientsUser getallById(Integer id);
	 
	public List getAllBYUsername(String username);

	public void save(IngredientsUser ingu);
	
	public void remove(IngredientsUser ingu);

	public void saveOrUpdate(IngredientsUser ingu);
	 
	public List getIngredientsUserByMaxid();

}
