package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.CupCakeImage;



public interface CupCakeImageService {
	
	public List getAllCupCakeImageBYid(Integer id);
	 
	public CupCakeImage getallCupCakeImageById(Integer id);
	 
	public List getCupCakeImageCake(Integer cupCakeId);

	public void saveCupCakeImage(CupCakeImage ck);
	
	public void removeCupCakeImage(CupCakeImage ck);

	public CupCakeImage saveOrUpdate(CupCakeImage ck);

}
