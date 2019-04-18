package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.LayerDetails;
import com.ets.csm.repository.LayerDetailsRepository;

@Service
public class LayerDetailsServiceImpl implements LayerDetailsService{
	
	
	@Autowired
	LayerDetailsRepository layerDetailsRepository;

	@Override
	public List getLayerDetails() {
		
		return layerDetailsRepository.getLayerDetails();
	}

	@Override
	public LayerDetails getLayerDetailsBYid(Integer id) {
		
		return layerDetailsRepository.getLayerDetailsByid(id);
	}

	@Override
	public void saveLayerDetails(LayerDetails ldts) {
		layerDetailsRepository.save(ldts);
		
	}

	@Override
	public void removeLayerDetails(LayerDetails ldts) {
		layerDetailsRepository.delete(ldts);
		
	}

	@Override
	public List getlayerDetailsByTier(Integer id) {
		
		return layerDetailsRepository.getlayerDetailsByTier(id);
	}

	@Override
	public List getlayersByTierID(Integer id) {
		
		return layerDetailsRepository.getlayersByTierID(id);
	}

	@Override
	public void delLayById(Integer id) {
		layerDetailsRepository.deleteById(id);
		
	}

}
