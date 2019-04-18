package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CupCakeWrapperPriceUser;
import com.ets.csm.repository.CupCakeWrapperUserRepository;

@Service
public class CpCkWrapperPriceUserServiceImpl implements CpCkWrapperPriceUserService{
	
	@Autowired
	CupCakeWrapperUserRepository cupCakeWrapperUserRepository;

	@Override
	public List getAllCpCkWrapperPriceUser() {
		
		return cupCakeWrapperUserRepository.getAllCupCakeWrapperPriceUser();
	}

	@Override
	public List getAllCpCkWrapperPriceUserBYid(Integer id) {
		
		return cupCakeWrapperUserRepository.getAllCupCakeWrapperPriceUserByid(id);
	}

	@Override
	public CupCakeWrapperPriceUser AllCpCkWrapperPriceUserBYid(Integer id) {
		
		return cupCakeWrapperUserRepository.getallCupCakeWrapperPriceUserById(id);
	}

	@Override
	public void saveCpCkWrapperPriceUser(CupCakeWrapperPriceUser cwp) {
		cupCakeWrapperUserRepository.save(cwp);
		
	}

	@Override
	public void removeCpCkWrapperPriceUser(CupCakeWrapperPriceUser cwp) {
		cupCakeWrapperUserRepository.delete(cwp);
		
	}

	@Override
	public void saveOrUpdateCpCkWrapperPriceUser(CupCakeWrapperPriceUser cwp) {
		cupCakeWrapperUserRepository.save(cwp);
		
	}

	@Override
	public List getAllCpCkWrapperPriceUserByUsername(String username) {
		
		return cupCakeWrapperUserRepository.getAllCupCakeWrapperPriceUserByUsername(username);
	} 

}
