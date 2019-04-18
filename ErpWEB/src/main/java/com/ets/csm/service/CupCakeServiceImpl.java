package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CupCake;
import com.ets.csm.repository.CupCakeRepository;

@Service
public class CupCakeServiceImpl implements CupCakeService{

	@Autowired
	CupCakeRepository cupCakeRepository;
	
	@Override
	public List getAllCupCake() {
		
		return cupCakeRepository.getAllCupCake();
	}

	@Override
	public List getAllCupCakeBYid(Integer id) {
		
		return cupCakeRepository.getAllupCakeByid(id);
	}

	@Override
	public CupCake getAllCupCakeById(Integer id) {
		
		return cupCakeRepository.getAllCupCakeByid(id);
	}

	@Override
	public List getAllCupCakeBYUsername(String username) {
		
		return cupCakeRepository.getAllCupCakeBYUserName(username);
	}

	@Override
	public CupCake getCupCakeByMaxid() {
		
		return cupCakeRepository.getCupCakeByMaxid();
	}

	@Override
	public void saveCupCake(CupCake cpCk) {
		cupCakeRepository.save(cpCk);
		
	}

	@Override
	public void removeCupCake(CupCake cpCk) {
		
		cupCakeRepository.delete(cpCk);
	}

	@Override
	public void saveOrUpdateCupCake(CupCake cpCk) {
		
		cupCakeRepository.save(cpCk);
	}

}
