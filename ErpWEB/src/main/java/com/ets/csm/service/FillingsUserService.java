package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.FillingsUser;

public interface FillingsUserService {
	
	public List getAllFillingsUser();
	 
	public List getAllFillingsUserBYid(Integer id);
	
	public FillingsUser getallFillingsUserById(Integer id);
	 
	public void saveFillingsUser(FillingsUser flu);
	
	public void removeFillingsUser(FillingsUser flu);

	public void saveOrUpdateFillingsUser(FillingsUser flu);

	public List getAllFillingsUserBYUserId(String userName);
	
	public List getFillingsUserByMaxid();

}
