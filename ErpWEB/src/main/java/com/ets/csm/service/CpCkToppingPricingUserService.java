package com.ets.csm.service;

import java.util.List;


import com.ets.csm.model.CupCakeToppingPricingUser;

public interface CpCkToppingPricingUserService {
	
	public List getAllCpCkToppingPriceUser();
	 
	public List getAllCpCkToppingPriceUserBYid(Integer id);
	
	public CupCakeToppingPricingUser AllCpCkToppingPriceUserBYid(Integer id);
	 
	public void saveCpCkToppingPriceUser(CupCakeToppingPricingUser ctp);
	
	public void removeCpCkToppingPriceUser(CupCakeToppingPricingUser ctp);

	public void saveOrUpdateCpCkToppingPriceUser(CupCakeToppingPricingUser ctp);

	public List getAllCpCkToppingPriceUserBYUserId(String userName);
	

}
