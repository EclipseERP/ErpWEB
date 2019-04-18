package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CpCakePricingUser;
import com.ets.csm.repository.CpCkPricingUserRepository;

@Service
public class CpCkPriceUserServiceImpl implements CpCkPriceUserService{

	@Autowired
	CpCkPricingUserRepository cpCkPricingUserRepository;
	
	@Override
	public List getAllCpCkPriceUser() {
		
		return cpCkPricingUserRepository.getAllCupCakePriceUser();
	}

	@Override
	public List getAllCpCkPriceUserBYid(Integer id) {
		
		return cpCkPricingUserRepository.getAllCupCakePriceUserByid(id);
	}

	@Override
	public void saveCpCkPriceUser(CpCakePricingUser cpu) {
		cpCkPricingUserRepository.save(cpu);
		
	}

	@Override
	public void removeCpCkPriceUser(CpCakePricingUser cpu) {
		cpCkPricingUserRepository.delete(cpu);
		
	}

	@Override
	public void saveOrUpdateCpCkPriceUser(CpCakePricingUser cpu) {
		cpCkPricingUserRepository.save(cpu);
		
	}

	@Override
	public List getAllCpCkPriceUserBYUserId(String userName) {
		
		return cpCkPricingUserRepository.getAllCupCakePriceBYUserid(userName);
	}

	@Override
	public CpCakePricingUser AllCpCkPriceUserBYid(Integer id) {
		// TODO Auto-generated method stub
		return cpCkPricingUserRepository.getAllCpCakePriceUserByid(id);
	}

	

}
