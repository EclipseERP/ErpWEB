package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.WrapperList;



public interface WrapperService {

	public List getAllWrappers();
	 
	public List getAllWrappersById(Integer id);
	 
	public void saveWrap(WrapperList wrap);
	
	public void removeWrap(WrapperList wrap);

	public void saveOrUpdateWrap(WrapperList wrap);

}
