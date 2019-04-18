package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.IcingsUser;
import com.ets.csm.repository.IcingUserRepository;

@Service
public class IcingsUserServiceImpl implements IcingsUserService{

	@Autowired
	IcingUserRepository icingUserRepository;
	
	@Override
	public List getAllIcingsUser() {
		
		return icingUserRepository.getAllIcingsUser();
	}

	@Override
	public List getAllIcingsUserBYid(Integer id) {
		return icingUserRepository.getAllIcingsUserByid(id);
	}

	@Override
	public IcingsUser getIcingsUserbyId(Integer id) {	
		return icingUserRepository.getIcingsUserbyId(id);
	}

	@Override
	public void saveIcingsUser(IcingsUser icu) {
		icingUserRepository.save(icu);
		
	}

	@Override
	public void removeIcingsUser(IcingsUser icu) {
		icingUserRepository.delete(icu);
		
	}

	@Override
	public void saveOrUpdateIcingsUser(IcingsUser icu) {
		icingUserRepository.save(icu);
		
	}

	@Override
	public List getIcingsUserByMaxid() {
		
		return icingUserRepository.getIcingsUserByMaxid();
	}

	@Override
	public List getAllIcingsUserByUserName(String username) {
	
		return icingUserRepository.getAllIcingsUserByUserName(username);
	}

}
