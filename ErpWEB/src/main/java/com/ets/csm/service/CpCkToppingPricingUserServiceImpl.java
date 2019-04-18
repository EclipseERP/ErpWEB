package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CupCakeToppingPricingUser;
import com.ets.csm.repository.CpCkToppingPricingUserRepository;

@Service
public class CpCkToppingPricingUserServiceImpl implements CpCkToppingPricingUserService{
	
	@Autowired
	CpCkToppingPricingUserRepository cpCkToppingPricingUserRepository;

	@Override
	public List getAllCpCkToppingPriceUser() {
		
		return cpCkToppingPricingUserRepository.getAllCpCkToppingPricingUser();
	}

	@Override
	public List getAllCpCkToppingPriceUserBYid(Integer id) {
		
		return cpCkToppingPricingUserRepository.getAllCpCkToppingPricingUserByid(id);
	}

	@Override
	public CupCakeToppingPricingUser AllCpCkToppingPriceUserBYid(Integer id) {
		
		return cpCkToppingPricingUserRepository.getallCpCkToppingPricingUserById(id);
	}

	@Override
	public void saveCpCkToppingPriceUser(CupCakeToppingPricingUser ctp) {
		cpCkToppingPricingUserRepository.save(ctp);
		
	}

	@Override
	public void removeCpCkToppingPriceUser(CupCakeToppingPricingUser ctp) {
		cpCkToppingPricingUserRepository.delete(ctp);
		
	}

	@Override
	public void saveOrUpdateCpCkToppingPriceUser(CupCakeToppingPricingUser ctp) {
		cpCkToppingPricingUserRepository.save(ctp);
		
	}

	@Override
	public List getAllCpCkToppingPriceUserBYUserId(String userName) {
		
		return cpCkToppingPricingUserRepository.getAllCpCkToppingPricingUserByUsername(userName);
	}

}
