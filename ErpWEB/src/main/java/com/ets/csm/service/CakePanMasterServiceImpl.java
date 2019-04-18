package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CakePansMaster;
import com.ets.csm.repository.CakePansMasterRepository;


@Service
public class CakePanMasterServiceImpl implements CakePanMasterService{

	@Autowired
	CakePansMasterRepository cakePansMasterRepository;
	
	@Override
	public List getAllCakePanMaster() {
		
		return cakePansMasterRepository.getAllCakePanMasterSize();
	}

	@Override
	public List getAllCakePanMasterBYid(Integer id) {
		return cakePansMasterRepository.getAllCakePanMasterSizeid(id);
	}

	@Override
	public void saveCakePanMaster(CakePansMaster cpm) {
		cakePansMasterRepository.save(cpm);		
	}

	@Override
	public void removeCakePanMaster(CakePansMaster cpm) {
		cakePansMasterRepository.delete(cpm);		
	}

	@Override
	public void saveOrUpdateCakePanMaster(CakePansMaster cpm) {
		cakePansMasterRepository.save(cpm);		
	}

}
