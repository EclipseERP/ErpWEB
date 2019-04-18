package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.IcingPurchaseMaster;

public interface IcingPurchaseMasterService {
	
	public List getAllIcingPurchaseMaster();
	
	public List getAllIcingPurchaseMasterByid(Integer id);
	 
	public void saveIcingPurchaseMaster(IcingPurchaseMaster ipm);
	
	public void removeIcingPurchaseMaster(IcingPurchaseMaster ipm);
	

}
