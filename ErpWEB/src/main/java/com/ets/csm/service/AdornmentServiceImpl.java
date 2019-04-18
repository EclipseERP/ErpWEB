package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Adornment;
import com.ets.csm.repository.AdornmentsRepository;

@Service
public class AdornmentServiceImpl implements AdornmentService{
	
	@Autowired
	AdornmentsRepository adornmentsRepository;

	@Override
	public List getAllAdornment() {
		// TODO Auto-generated method stub
		return adornmentsRepository.getAllAdornment();
	}

	@Override
	public List getAllAdornmentBYid(Integer id) {
		// TODO Auto-generated method stub
		return adornmentsRepository.getAllAdornmentByid(id);
	}

	@Override
	public Adornment getAllAdornmentById(Integer id) {
		// TODO Auto-generated method stub
		return adornmentsRepository.getallAdornmentById(id);
	}

	@Override
	public List getAllAdornmentBYCakeId(Integer CakeId) {
		// TODO Auto-generated method stub
		return adornmentsRepository.getAllAdornmentBYCakeid(CakeId);
	}

	@Override
	public void saveAdornment(Adornment cake) {
		adornmentsRepository.save(cake);
		
	}

	@Override
	public void removeAdornment(Adornment cake) {
		// TODO Auto-generated method stub
		adornmentsRepository.delete(cake);
	}

	@Override
	public void saveOrUpdateAdornment(Adornment cake) {
		// TODO Auto-generated method stub
		adornmentsRepository.save(cake);
	}
	
	
	
	

}
