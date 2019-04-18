package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.ToppingsList;

public interface ToppingService {
	
	
	public List getAllToppings();
	 
	public List getAllToppingsById(Integer id);
	 
	public void saveTopp(ToppingsList topp);
	
	public void removeTopp(ToppingsList topp);

	public void saveOrUpdateTopp(ToppingsList topp);

	 

}
