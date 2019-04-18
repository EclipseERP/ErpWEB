package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.PlatePostDetails;
import com.ets.csm.repository.PlatePostRepository;

@Service
public class PlatePostServiceImpl implements PlatePostService{
	
	@Autowired
	PlatePostRepository platePostRepository;

	@Override
	public List getAllPlatePost() {
		
		return platePostRepository.getAllPlatePostDetails();
	}

	@Override
	public List getAllPlatePostBYid(Integer id) {
		
		return platePostRepository.getAllPlatePostDetailsByid(id);
	}

	@Override
	public PlatePostDetails getallPlatePostById(Integer id) {
		
		return platePostRepository.getallPlatePostDetailsById(id);
	}

	@Override
	public List getAllPlatePostByTierId(Integer tierId) {
		return platePostRepository.getAllPlatePostDetailsByTierId(tierId);
	}

	@Override
	public void savePlatePost(PlatePostDetails ppd) {
		platePostRepository.save(ppd);
		
	}

	@Override
	public void removePlatePost(PlatePostDetails ppd) {
		platePostRepository.delete(ppd);
	}

	@Override
	public void saveOrUpdatePlatePost(PlatePostDetails ppd) {
		platePostRepository.save(ppd);
		
	}

	@Override
	public List getPlateMetriByTier(Integer tierId) {
	
		return platePostRepository.getPlateMetriByTier(tierId);
	}
	
	
}
