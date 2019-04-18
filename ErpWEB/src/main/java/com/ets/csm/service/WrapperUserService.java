package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.WrapperUser;

public interface WrapperUserService {
	
	public List getAllWrapperUser();
	 
	public List getAllWrapperUserBYid(Integer id);
	
	public WrapperUser AllWrapperUserBYid(Integer id);
	
	public List getallWrapperUserByUsername(String username);
	 
	public void saveWrapperUser(WrapperUser wu);
	
	public void removeWrapperUser(WrapperUser wu);

	public void saveOrUpdateWrapperUser(WrapperUser wu);

}
