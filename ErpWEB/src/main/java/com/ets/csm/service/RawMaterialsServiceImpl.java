package com.ets.csm.service;
import java.util.Date;

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

}
