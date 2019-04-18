package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.IcingIngredientUser;


public interface IcingIngredientUserService {

	public List getAllIcingingredients();
	 
	public List getAllIcingingredientsBYid(Integer id);
	
	public IcingIngredientUser getallIcingingredientsById(Integer id);
	 
	public List getAllIcingingredientsBYIcingId(int icingId);

	public void save(IcingIngredientUser icing);
	
	public void remove(IcingIngredientUser icing);

	public void saveOrUpdate(IcingIngredientUser icing);
	
}
