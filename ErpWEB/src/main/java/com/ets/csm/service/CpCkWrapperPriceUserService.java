package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.CupCakeWrapperPriceUser;

public interface CpCkWrapperPriceUserService {
	
	public List getAllCpCkWrapperPriceUser();
	 
	public List getAllCpCkWrapperPriceUserBYid(Integer id);
	
	public CupCakeWrapperPriceUser AllCpCkWrapperPriceUserBYid(Integer id);
	
	public List getAllCpCkWrapperPriceUserByUsername(String username);
	 
	public void saveCpCkWrapperPriceUser(CupCakeWrapperPriceUser cwp);
	
	public void removeCpCkWrapperPriceUser(CupCakeWrapperPriceUser cwp);

	public void saveOrUpdateCpCkWrapperPriceUser(CupCakeWrapperPriceUser cwp);
	

}
