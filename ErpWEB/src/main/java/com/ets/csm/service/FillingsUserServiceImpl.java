package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.FillingsUser;
import com.ets.csm.repository.FillingsUserRepository;

@Service
public class FillingsUserServiceImpl implements FillingsUserService{

	@Autowired
	FillingsUserRepository fillingsUserRepository;
	
	@Override
	public List getAllFillingsUser() {
		
		return fillingsUserRepository.getAllFillingsUser();
	}

	@Override
	public List getAllFillingsUserBYid(Integer id) {
		
		return fillingsUserRepository.getAllFillingsUserByid(id);
	}

	@Override
	public FillingsUser getallFillingsUserById(Integer id) {
		
		return fillingsUserRepository.getallFillingsUserById(id);
	}

	@Override
	public void saveFillingsUser(FillingsUser flu) {
		fillingsUserRepository.save(flu);
		
	}

	@Override
	public void removeFillingsUser(FillingsUser flu) {
		fillingsUserRepository.delete(flu);
		
	}

	@Override
	public void saveOrUpdateFillingsUser(FillingsUser flu) {
		fillingsUserRepository.save(flu);
		
	}

	@Override
	public List getAllFillingsUserBYUserId(String userName) {
		
		return fillingsUserRepository.getAllFillingsUserByUsername(userName);
	}

	@Override
	public List getFillingsUserByMaxid() {
		
		return fillingsUserRepository.getFillingsUserByMaxid();
	}
	
	

}
