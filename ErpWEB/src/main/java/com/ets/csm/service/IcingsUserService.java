package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.IcingsUser;

public interface IcingsUserService {

	public List getAllIcingsUser();
	 
	public List getAllIcingsUserBYid(Integer id);
	
	public IcingsUser getIcingsUserbyId(Integer id);
	
	public List getAllIcingsUserByUserName(String username);
	 
	public void saveIcingsUser(IcingsUser icu);
	
	public void removeIcingsUser(IcingsUser icu);

	public void saveOrUpdateIcingsUser(IcingsUser icu);
	
	public List getIcingsUserByMaxid();
	
	
}
