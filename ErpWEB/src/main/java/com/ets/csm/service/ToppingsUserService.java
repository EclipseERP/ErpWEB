package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.ToppingsUser;

public interface ToppingsUserService {
	
	public List getAllToppingsUser();
	 
	public List getAllToppingsUserBYid(Integer id);
	
	public ToppingsUser getallToppingsUserById(Integer id);
	 
	public void saveToppingsUser(ToppingsUser topu);
	
	public void removeToppingsUser(ToppingsUser topu);

	public void saveOrUpdateToppingsUser(ToppingsUser topu);

	public List getAllToppingsUserBYUserId(String userName);
	

}
