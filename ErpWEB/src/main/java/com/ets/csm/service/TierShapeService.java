package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.TierShape;

public interface TierShapeService {

	public List getAllTierShape();
	 
	public List getAllTierShapeBYid(Integer id);
	
	public TierShape getallTierShapeById(Integer id);
	 
	public List getAllTierShapeBYUsername(String username);

	public void saveTierShape(TierShape trshp);
	
	public void removeTierShape(TierShape trshp);

	public void saveOrUpdateTierShape(TierShape trshp);

}
