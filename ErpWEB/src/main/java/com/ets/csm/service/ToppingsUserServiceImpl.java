package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.ToppingsUser;
import com.ets.csm.repository.ToppingsUserRepository;

@Service
public class ToppingsUserServiceImpl implements ToppingsUserService{

	@Autowired
	ToppingsUserRepository toppingsUserRepository;
	
	@Override
	public List getAllToppingsUser() {
		
		return toppingsUserRepository.getAllToppingsUser();
	}

	@Override
	public List getAllToppingsUserBYid(Integer id) {
		
		return toppingsUserRepository.getAllToppingsUserByid(id);
	}

	@Override
	public ToppingsUser getallToppingsUserById(Integer id) {
		
		return toppingsUserRepository.getallToppingsUserById(id);
	}

	@Override
	public void saveToppingsUser(ToppingsUser topu) {
		toppingsUserRepository.save(topu);
		
	}

	@Override
	public void removeToppingsUser(ToppingsUser topu) {
		toppingsUserRepository.delete(topu);
		
	}

	@Override
	public void saveOrUpdateToppingsUser(ToppingsUser topu) {
		toppingsUserRepository.save(topu);
		
	}

	@Override
	public List getAllToppingsUserBYUserId(String userName) {
		
		return toppingsUserRepository.getAllToppingsUserByUsername(userName);
	}

}
