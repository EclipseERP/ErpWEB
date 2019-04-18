package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ets.csm.model.CakeImage;
import com.ets.csm.repository.CakeImageRepository;


@Service
public class CakeImageServiceImpl implements CakeImageService{

	@Autowired
	private CakeImageRepository cakeImageRepository;
	
	@Override
	public List getAllCakeImageBYid(Integer id) {
		return cakeImageRepository.getAllCakeImageBYid(id);
	}

	@Override
	public CakeImage getallCakeImageById(Integer id) {
		return cakeImageRepository.getallCakeImageById(id);
	}

	@Override
	public List getCakeImageCake(Integer cakeId) {
		return cakeImageRepository.getCakeImageCake(cakeId);
	}

	@Override
	public void saveCakeImage(CakeImage ck) {
		cakeImageRepository.save(ck);
	}

	@Override
	public void removeCakeImage(CakeImage ck) {
		cakeImageRepository.delete(ck);
	}

	@Override
	public CakeImage saveOrUpdate(CakeImage ck) {
		return cakeImageRepository.save(ck);
	}

	
}
