package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.RecipePricingUser;
import com.ets.csm.repository.RecipePricingUserRepository;

@Service
public class RecipePricingUserServiceImpl implements RecipePricingUserService{

	@Autowired
	RecipePricingUserRepository recipePricingUserRepository;
	
	@Override
	public List getAllRecipePriceUser() {
		
		return recipePricingUserRepository.getAllRecipePricingUser();
	}

	@Override
	public List getAllRecipePriceUserBYid(Integer id) {
		
		return recipePricingUserRepository.getAllRecipePricingUserByid(id);
	}

	@Override
	public void saveRecipePriceUser(RecipePricingUser rpu) {
		recipePricingUserRepository.save(rpu);
		
	}

	@Override
	public void removeRecipePriceUser(RecipePricingUser rpu) {
		recipePricingUserRepository.delete(rpu);
		
	}

	@Override
	public void saveOrUpdateRecipePriceUser(RecipePricingUser rpu) {
		recipePricingUserRepository.save(rpu);
		
	}

	@Override
	public List getAllRecipePriceUserBYUserId(String userName) {
		
		return recipePricingUserRepository.getAllRecipePricingUserBYUserid(userName);
	}

}
