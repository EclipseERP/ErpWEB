package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.CpCakePricingUser;

public interface CpCkPriceUserService {
	
	public List getAllCpCkPriceUser();
	 
	public List getAllCpCkPriceUserBYid(Integer id);
	
	public CpCakePricingUser AllCpCkPriceUserBYid(Integer id);
	 
	public void saveCpCkPriceUser(CpCakePricingUser cpu);
	
	public void removeCpCkPriceUser(CpCakePricingUser cpu);

	public void saveOrUpdateCpCkPriceUser(CpCakePricingUser cpu);

	public List getAllCpCkPriceUserBYUserId(String userName);
	

}
