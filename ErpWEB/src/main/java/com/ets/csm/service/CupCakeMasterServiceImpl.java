package com.ets.csm.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CupCakeMaster;
import com.ets.csm.repository.CupCakeMasterRepository;

@Service
public class CupCakeMasterServiceImpl implements CupCakeMasterService{

	@Autowired
	CupCakeMasterRepository cupCakeMasterRepository;
	
	@Override
	public List getAllCupCakeMaster() {
		
		return cupCakeMasterRepository.getAllCupCakeMaster();
	}

	@Override
	public List getAllCupCakeMasterBYid(Integer id) {
		
		return cupCakeMasterRepository.getAllCupCakeMasterByid(id);
	}

	@Override
	public void saveCupCakeMaster(CupCakeMaster ccm) {
		cupCakeMasterRepository.save(ccm);
		
	}

	@Override
	public void removeCupCakeMaster(CupCakeMaster ccm) {
		cupCakeMasterRepository.delete(ccm);
		
	}

	@Override
	public void saveOrUpdateCupCakeMaster(CupCakeMaster ccm) {
		cupCakeMasterRepository.save(ccm);
		
	}

	@Override
	public List getCupCakesbyMaxId() {
	
		return cupCakeMasterRepository.getCupCakeMasterByMaxid();
	}

	@Override
	public CupCakeMaster getallCupCakeMasterById(Integer id) {
		
		return cupCakeMasterRepository.getCupCakeMasterbyId(id);
	}

}
