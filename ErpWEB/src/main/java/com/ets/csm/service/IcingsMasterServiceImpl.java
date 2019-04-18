package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.IcingsMaster;
import com.ets.csm.repository.IcingMasterRepository;

@Service
public class IcingsMasterServiceImpl implements IcingsMasterService{

	@Autowired
	IcingMasterRepository icingMasterRepository;
	
	@Override
	public List getAllIcingsMaster() {
		
		return icingMasterRepository.getAllIcingsMaster();
	}

	@Override
	public List getAllIcingsMasterBYid(Integer id) {
		
		return icingMasterRepository.getAllIcingsMasterByid(id);
	}

	@Override
	public IcingsMaster getIcingsMasterbyId(Integer id) {
		
		return icingMasterRepository.getIcingsMasterbyId(id);
	}

	@Override
	public void saveIcingsMaster(IcingsMaster icm) {
		icingMasterRepository.save(icm);
		
	}

	@Override
	public void removeIcingsMaster(IcingsMaster icm) {
		icingMasterRepository.delete(icm);
		
	}

	@Override
	public void saveOrUpdateIcingsMaster(IcingsMaster icm) {
		icingMasterRepository.save(icm);
		
	}

	@Override
	public List getIcingsMasterByMaxid() {
		
		return icingMasterRepository.getIcingsMasterByMaxid();
	}

}
