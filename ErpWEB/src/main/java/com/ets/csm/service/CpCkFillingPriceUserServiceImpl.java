package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CupCakeFillingPrice;
import com.ets.csm.repository.CupCakeFillingUserRepository;

@Service
public class CpCkFillingPriceUserServiceImpl implements CpCkFillingPriceUserService{

	@Autowired
	CupCakeFillingUserRepository cupCakeFillingUserRepository;
	
	@Override
	public List getAllCpCkFillingPrice() {
		
		return cupCakeFillingUserRepository.getAllCupCakeFillingPrice();
	}

	@Override
	public List getAllCpCkFillingPriceBYid(Integer id) {
		
		return cupCakeFillingUserRepository.getAllCupCakeFillingPriceByid(id);
	}

	@Override
	public CupCakeFillingPrice getallCpCkFillingPriceById(Integer id) {
		
		return cupCakeFillingUserRepository.getallCupCakeFillingPriceById(id);
	}

	@Override
	public void saveCpCkFillingPrice(CupCakeFillingPrice cfp) {
		cupCakeFillingUserRepository.save(cfp);
		
	}

	@Override
	public void removeCpCkFillingPrice(CupCakeFillingPrice cfp) {
		cupCakeFillingUserRepository.delete(cfp);
		
	}

	@Override
	public void saveOrUpdateCpCkFillingPrice(CupCakeFillingPrice cfp) {
		cupCakeFillingUserRepository.save(cfp);
		
	}

	@Override
	public List getAllCpCkFillingPriceBYUserId(String userName) {
		
		return cupCakeFillingUserRepository.getAllCupCakeFillingPriceByUsername(userName);
	}

}
