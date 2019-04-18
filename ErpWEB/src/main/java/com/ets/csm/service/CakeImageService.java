package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.CakeImage;


public interface CakeImageService {
	 
	public List getAllCakeImageBYid(Integer id);
	 
	public CakeImage getallCakeImageById(Integer id);
	 
	public List getCakeImageCake(Integer cakeId);

	public void saveCakeImage(CakeImage ck);
	
	public void removeCakeImage(CakeImage ck);

	public CakeImage saveOrUpdate(CakeImage ck);
}
