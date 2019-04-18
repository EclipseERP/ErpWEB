package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.FillingPurchaseUser;
import com.ets.csm.repository.FillingPurchaseUserRepository;

@Service
public class FillingPurchaseUserServiceImpl implements FillingPurchaseUserService{
	
	@Autowired
	FillingPurchaseUserRepository fillingPurchaseUserRepository;

	@Override
	public List getAllFillingPurchaseUser() {
		
		return fillingPurchaseUserRepository.getAllFillingPurchaseUser();
	}

	@Override
	public List getAllFillingPurchaseUserBYid(Integer id) {
		
		return fillingPurchaseUserRepository.getAllFillingPurchaseUserByid(id);
	}

	@Override
	public FillingPurchaseUser getallFillingPurchaseUserById(Integer id) {
		
		return fillingPurchaseUserRepository.getFillingPurchaseUserbyId(id);
	}

	@Override
	public void saveFillingPurchaseUser(FillingPurchaseUser fpu) {
		fillingPurchaseUserRepository.save(fpu);
		
	}

	@Override
	public void removeFillingPurchaseUser(FillingPurchaseUser fpu) {
		fillingPurchaseUserRepository.delete(fpu);
		
	}

	@Override
	public void saveOrUpdateFillingPurchaseUser(FillingPurchaseUser fpu) {
		fillingPurchaseUserRepository.save(fpu);
		
	}

	@Override
	public List getAllFillingPurchaseUserBYUserId(String userName) {
		
		return fillingPurchaseUserRepository.getAllFillingPurchaseUserByFillingId(userName);
	}

}
