package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CupCakeImage;
import com.ets.csm.repository.CupCakeImageRepository;

@Service
public class CupCakeImageServiceImpl implements CupCakeImageService{
	@Autowired
	private CupCakeImageRepository cupCakeImageRepository;
	
	@Override
	public List getAllCupCakeImageBYid(Integer id) {
		return cupCakeImageRepository.getAllCupCakeImageBYid(id);
	}

	@Override
	public CupCakeImage getallCupCakeImageById(Integer id) {
		return cupCakeImageRepository.getallCupCakeImageById(id);
	}

	@Override
	public List getCupCakeImageCake(Integer cupCakeId) {
		return cupCakeImageRepository.getCupCakeImageCake(cupCakeId);
	}

	@Override
	public void saveCupCakeImage(CupCakeImage ck) {
		cupCakeImageRepository.save(ck);
	}

	@Override
	public void removeCupCakeImage(CupCakeImage ck) {
		cupCakeImageRepository.delete(ck);
	}

	@Override
	public CupCakeImage saveOrUpdate(CupCakeImage ck) {
		return cupCakeImageRepository.save(ck);
	}


}
