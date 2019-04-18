package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.IcingPurchaseMaster;
import com.ets.csm.repository.IcingPurchaseMasterRepository;

@Service
public class IcingPurchaseMasterServiceImpl implements IcingPurchaseMasterService{
	
	@Autowired
	IcingPurchaseMasterRepository icingPurchaseMasterRepository;

	@Override
	public List getAllIcingPurchaseMaster() {
		
		return icingPurchaseMasterRepository.getAllIcingPurchaseMaster();
	}

	@Override
	public List getAllIcingPurchaseMasterByid(Integer id) {
		
		return icingPurchaseMasterRepository.getAllIcingPurchaseMasterByid(id);
	}

	@Override
	public void saveIcingPurchaseMaster(IcingPurchaseMaster ipm) {
		icingPurchaseMasterRepository.save(ipm);
		
	}

	@Override
	public void removeIcingPurchaseMaster(IcingPurchaseMaster ipm) {
		icingPurchaseMasterRepository.delete(ipm);
		
	}
	
	

}
