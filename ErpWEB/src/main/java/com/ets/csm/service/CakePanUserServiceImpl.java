package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CakePansUser;
import com.ets.csm.repository.CakePansUserRepository;


@Service
public class CakePanUserServiceImpl implements CakePanUserService{

	@Autowired
	CakePansUserRepository cakePansUserRepository;
	
	@Override
	public List getAllCakePanUser() {
		
		return cakePansUserRepository.getAllCakePanUserSize();
	}

	@Override
	public List getAllCakePanUserBYid(Integer id) {
		return cakePansUserRepository.getAllCakePanUserSizeid(id);
	}

	@Override
	public void saveCakePanUser(CakePansUser cpm) {
		cakePansUserRepository.save(cpm);		
	}

	@Override
	public void removeCakePanUser(CakePansUser cpm) {
		cakePansUserRepository.delete(cpm);		
	}

	@Override
	public void saveOrUpdateCakePanUser(CakePansUser cpm) {
		cakePansUserRepository.save(cpm);		
	}
	
	public List getCkPansBYUserid(String userName) {
		return cakePansUserRepository.getCkPansBYUserid(userName);
	}

	@Override
	public CakePansUser getallCakePanUserById(Integer id) {
		return cakePansUserRepository.getallCakePanUserSizeById(id);
	}

	@Override
	public List getCkPansBYCategoryid(Integer categoryId, String userName) {
		// TODO Auto-generated method stub
		return cakePansUserRepository.getCkPansBYCategoryId(categoryId, userName);
	}

}
