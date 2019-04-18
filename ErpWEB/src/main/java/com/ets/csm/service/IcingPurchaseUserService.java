package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.IcingPurchaseUser;

public interface IcingPurchaseUserService {
	
	public List getAllIcingPurchaseUser();
	 
	public List getAllIcingPurchaseUserBYid(Integer id);
	
	public IcingPurchaseUser getallIcingPurchaseUserById(Integer id);
	 
	public void saveIcingPurchaseUser(IcingPurchaseUser ipu);
	
	public void removeIcingPurchaseUser(IcingPurchaseUser ipu);

	public void saveOrUpdateIcingPurchaseUser(IcingPurchaseUser ipu);

	public List getAllIcingPurchaseUserBYUsername(String userName);

}
