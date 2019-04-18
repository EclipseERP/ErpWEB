package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.TierDetails;
import com.ets.csm.repository.TierDetailsRepository;

@Service
public class TierDetailsServiceImpl implements TierDetailsService{
	
	@Autowired
	TierDetailsRepository tierDetailsRepository;

	@Override
	public List getAllTierDetails() {
		
		return tierDetailsRepository.getAllTierDetails();
	}

	@Override
	public List getAllTierDetailsBYid(Integer id) {
		
		return tierDetailsRepository.getAllTierDetailsByid(id);
	}

	@Override
	public TierDetails getallTierDetailsById(Integer id) {
		
		return tierDetailsRepository.getallTierDetailsById(id);
	}

	@Override
	public void saveTierDetails(TierDetails td) {
		tierDetailsRepository.save(td);
		
	}

	@Override
	public void removeTierDetails(TierDetails td) {
		tierDetailsRepository.delete(td);
		
	}

	@Override
	public void saveOrUpdateTierDetails(TierDetails td) {
		tierDetailsRepository.save(td);
		
	}

	@Override
	public List getTierDetailsByCake(Integer id) {
		return tierDetailsRepository.getTierDetailsByCake(id);
	}

	@Override
	public List getTierDetailsPriceByCake(Integer id) {
		
		return tierDetailsRepository.getTierDetailsPriceByCake(id);
	}

}
