package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.TierShape;
import com.ets.csm.repository.TierShapeRepository;

@Service
public class TierShapeServiceImpl implements TierShapeService{
	
	@Autowired
	TierShapeRepository tierShapeRepository;

	@Override
	public List getAllTierShape() {
	
		return tierShapeRepository.getAllTierShape();
	}

	@Override
	public List getAllTierShapeBYid(Integer id) {
	
		return tierShapeRepository.getAllTierShapeByid(id);
	}

	@Override
	public TierShape getallTierShapeById(Integer id) {
		
		return tierShapeRepository.getallTierShapeById(id);
	}

	@Override
	public List getAllTierShapeBYUsername(String username) {
	
		return tierShapeRepository.getAllTierShapeByUsername(username);
	}

	@Override
	public void saveTierShape(TierShape trshp) {
		tierShapeRepository.save(trshp);
		
	}

	@Override
	public void removeTierShape(TierShape trshp) {
		tierShapeRepository.delete(trshp);
		
	}

	@Override
	public void saveOrUpdateTierShape(TierShape trshp) {
		tierShapeRepository.save(trshp);
		
	}

}
