package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.IcingPurchaseUser;
import com.ets.csm.repository.IcingPurchaseUserRepository;

@Service
public class IcingPurchaseUserServiceImpl implements IcingPurchaseUserService{
	
	@Autowired
	IcingPurchaseUserRepository icingPurchaseUserService;

	@Override
	public List getAllIcingPurchaseUser() {
		
		return icingPurchaseUserService.getAllIcingPurchaseUser();
	}

	@Override
	public List getAllIcingPurchaseUserBYid(Integer id) {
		
		return icingPurchaseUserService.getAllIcingPurchaseUserByid(id);
	}

	@Override
	public IcingPurchaseUser getallIcingPurchaseUserById(Integer id) {
		
		return icingPurchaseUserService.getIcingPurchaseUserbyId(id);
	}

	@Override
	public void saveIcingPurchaseUser(IcingPurchaseUser ipu) {
		icingPurchaseUserService.save(ipu);
		
	}

	@Override
	public void removeIcingPurchaseUser(IcingPurchaseUser ipu) {
		icingPurchaseUserService.delete(ipu);
		
	}

	@Override
	public void saveOrUpdateIcingPurchaseUser(IcingPurchaseUser ipu) {
		icingPurchaseUserService.save(ipu);
		
	}

	@Override
	public List getAllIcingPurchaseUserBYUsername(String userName) {
		
		return icingPurchaseUserService.getAllIcingPurchaseUserByUsername(userName);
	}
	
	

}
