package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.Adornment;
import com.ets.csm.model.Cake;

public interface CakeService {
	
	public List getAllCake();
	 
	public List getAllCakeBYid(Integer id);
	
	public Cake getAllCakeById(Integer id);
	
	public List getAllPredefinedCakes(String username,Integer cakeType);
	
	public List getAllCakeBYType(String username,Integer cakeType);
	
	public List getTierPrice(Integer id);
	
	public List getLayerPrice(Integer id);
	 
	public List getAllCakeBYUsername(String username);

	public Cake getCakeByMaxid();
	
	public void saveCake(Cake cake);
	
	public void removeCake(Cake cake);

	public void saveOrUpdateCake(Cake cake);
	
	public List getAdornmentDetailsByCakeID(Integer id);
	
	public List getAdornCategoriesDetsils(Integer id);
	
	public Integer saveAdornment(Adornment adb);
	
	public void customeUpdateAdorment(Integer id);
	
	public List getAdornmentDetailsBycupCakeID(Integer id);
	
	public void deleteAdornment(Adornment adorn);
	
	public List getAllAdornmentsDatawithJoinAndByCupCakeId(Integer id);
	
}
