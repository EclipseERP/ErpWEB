package com.ets.csm.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.ets.csm.model.PlatePostDetails;

public interface PlatePostService {
	
	public List getAllPlatePost();
	 
	public List getAllPlatePostBYid(Integer id);
	
	public PlatePostDetails getallPlatePostById(Integer id);
	 
	public List getAllPlatePostByTierId(Integer tierId);
	
	public List getPlateMetriByTier(Integer tierId);

	public void savePlatePost(PlatePostDetails ppd);
	
	public void removePlatePost(PlatePostDetails ppd);

	public void saveOrUpdatePlatePost(PlatePostDetails ppd);
	

}
