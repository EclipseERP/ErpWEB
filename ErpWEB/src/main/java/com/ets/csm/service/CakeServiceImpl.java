package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Adornment;
import com.ets.csm.model.Cake;
import com.ets.csm.repository.Adorn_CatRepository;
import com.ets.csm.repository.AdornmentsRepository;
import com.ets.csm.repository.CakeRepository;

@Service
public class CakeServiceImpl implements CakeService{
	
	@Autowired
	CakeRepository cakeRepository;
	
	@Autowired
	AdornmentsRepository adornmentRepository;
	
	@Autowired
	Adorn_CatRepository adorncategoryrepository;
	
	
	@Override
	public List getAllCake() {
		
		return cakeRepository.getAllCake();
	}

	@Override
	public List getAllCakeBYid(Integer id) {
		
		return cakeRepository.getAllCakeByid(id);
	}

	@Override
	public List getAllCakeBYUsername(String username) {
		
		return cakeRepository.getAllCakeBYUserid(username);
	}

	@Override
	public void saveCake(Cake cake) {
		cakeRepository.save(cake);
		
	}

	@Override
	public void removeCake(Cake cake) {
		cakeRepository.delete(cake);
	}

	@Override
	public void saveOrUpdateCake(Cake cake) {
		cakeRepository.save(cake);
		
	}

	@Override
	public Cake getAllCakeById(Integer id) {
		return cakeRepository.getallCakeById(id);
	}

	@Override
	public Cake getCakeByMaxid() {
		return cakeRepository.getCakeByMaxid();
	}

	@Override
	public List getTierPrice(Integer id) {
		
		return cakeRepository.getTierPrice(id);
	}
	
	@Override
	public List getLayerPrice(Integer id) {
		
		return cakeRepository.getLayerPrice(id);
	}

	@Override
	public List getAllPredefinedCakes(String username,Integer caketype) {
		int id=1;
		return cakeRepository.getAllPredefinedCakesbyUserName(username,id,caketype);
	}

	@Override
	public List getAllCakeBYType(String username, Integer cakeType) {
		
		return cakeRepository.getAllCakeBYType(username, cakeType);
	}

	@Override
	public List getAdornmentDetailsByCakeID(Integer id) {
		// TODO Auto-generated method stub
		return adornmentRepository.getAllAdornmentBYCakeid(id);
	}
	
	@Override
	public List getAdornCategoriesDetsils(Integer id)
	{
		return adorncategoryrepository.getAllCategoriesBYid(id);
	}

	@Override
	public Integer saveAdornment(Adornment adb) {
		// TODO Auto-generated method stub
		return adornmentRepository.save(adb).getId();
		
	}

	@Override
	public void customeUpdateAdorment(Integer id) {
		// TODO Auto-generated method stub
		adornmentRepository.updateAdormentCustome(id);
	}

	@Override
	public List getAdornmentDetailsBycupCakeID(Integer id) {
		// TODO Auto-generated method stub
		return adornmentRepository.getAllAdornmentBYCupCakeid(id);
	}
	
	@Override
	public void deleteAdornment(Adornment adorn) {
		// TODO Auto-generated method stub
	
		 adornmentRepository.delete(adorn);
	}
	@Override
	public List getAllAdornmentsDatawithJoinAndByCupCakeId(Integer id)
	{
		return adornmentRepository.getAllAdornmentWithJoinBYCupCakeid(id);
	}
	
}
