package com.ets.csm.service;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.ets.csm.model.RawMaterials;
import com.ets.csm.repository.RawMaterialsRepository;

public class RawMaterialsServiceImpl implements RawMaterialsService{

	
	@Autowired
	private RawMaterialsRepository RawMaterialsRepository;
	
	@Override
	public RawMaterials saveOrUpdate(RawMaterials rm) {
		return RawMaterialsRepository.save(rm);
	}
}
