package com.ets.csm.service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ets.csm.model.RawMaterials;
import com.ets.csm.repository.RawMaterialsRepository;
@Service

public class RawMaterialsServiceImpl implements RawMaterialsService{
    @Autowired
	RawMaterialsRepository rawmaterialrepository;
	
	@Override
	public void saveItemData(RawMaterials raw) {
		// TODO Auto-generated method stub
		rawmaterialrepository.save(raw);
	}
	
	
	
	
	@Autowired
	private RawMaterialsRepository RawMaterialsRepository;
	
	@Override
	public RawMaterials saveOrUpdate(RawMaterials rm) {
		return RawMaterialsRepository.save(rm);
	}
	@Override
	public List getAllRawMaterials()
	{
		return rawmaterialrepository.getAllRawMaterials();
	}
	
	
	
	@Override
	public RawMaterials getAllRawMaterialsByItemcode(String itemcode)
	{
		return rawmaterialrepository.getAllRawMaterialsByItemcode(itemcode);
	}
	
	
	
	
	
	
	
	
}
