package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.FillingPurchaseUser;

public interface FillingPurchaseUserService {
	
	public List getAllFillingPurchaseUser();
	 
	public List getAllFillingPurchaseUserBYid(Integer id);
	
	public FillingPurchaseUser getallFillingPurchaseUserById(Integer id);
	 
	public void saveFillingPurchaseUser(FillingPurchaseUser fpu);
	
	public void removeFillingPurchaseUser(FillingPurchaseUser fpu);

	public void saveOrUpdateFillingPurchaseUser(FillingPurchaseUser fpu);

	public List getAllFillingPurchaseUserBYUserId(String userName);

}
