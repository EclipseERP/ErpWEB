package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.WrapperUser;
import com.ets.csm.repository.WrapperUserRepository;

@Service
public class WrapperUserServiceImpl implements WrapperUserService{
	
	@Autowired
	WrapperUserRepository wrapperUserRepository;

	@Override
	public List getAllWrapperUser() {
		
		return wrapperUserRepository.getAllWrapperUser();
	}

	@Override
	public List getAllWrapperUserBYid(Integer id) {
		
		return wrapperUserRepository.getAllWrapperUserByid(id);
	}

	@Override
	public WrapperUser AllWrapperUserBYid(Integer id) {
		
		return wrapperUserRepository.getallWrapperUserById(id);
	}

	@Override
	public List getallWrapperUserByUsername(String username) {
		
		return wrapperUserRepository.getAllWrapperUserByUsername(username);
	}

	@Override
	public void saveWrapperUser(WrapperUser wu) {
		wrapperUserRepository.save(wu);
		
	}

	@Override
	public void removeWrapperUser(WrapperUser wu) {
		wrapperUserRepository.delete(wu);
		
	}

	@Override
	public void saveOrUpdateWrapperUser(WrapperUser wu) {
		wrapperUserRepository.save(wu);
		
	}
	
	

}
