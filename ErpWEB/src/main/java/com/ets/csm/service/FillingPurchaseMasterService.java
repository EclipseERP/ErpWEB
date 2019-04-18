package com.ets.csm.service;

import java.util.List;
import com.ets.csm.model.FillingPurchaseMaster;

public interface FillingPurchaseMasterService {
	 
	public List getAllFillingPurchaseMaster();
	
	public List getAllFillingPurchaseMasterByid(Integer id);
	 
	public void saveFillingPurchaseMaster(FillingPurchaseMaster ing);
	
	public void removeFillingPurchaseMaster(FillingPurchaseMaster ing);

}
