package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.LayerDetails;

public interface LayerDetailsService {
	
	public List getLayerDetails();
	 
	public LayerDetails getLayerDetailsBYid(Integer id);
	
	public List getlayerDetailsByTier(Integer id);
	
	public List getlayersByTierID(Integer id);
	 
	public void saveLayerDetails(LayerDetails ldts);
	
	public void removeLayerDetails(LayerDetails ldts);
	
	public void delLayById(Integer id);

}
