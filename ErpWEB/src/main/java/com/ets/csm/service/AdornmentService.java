package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.Adornment;

public interface AdornmentService {
	
	public List getAllAdornment();
	 
	public List getAllAdornmentBYid(Integer id);
	
	public Adornment getAllAdornmentById(Integer id);
	
	public List getAllAdornmentBYCakeId(Integer CakeId);
	
    public void saveAdornment(Adornment cake);
	
	public void removeAdornment(Adornment cake);

	public void saveOrUpdateAdornment(Adornment cake);


}
