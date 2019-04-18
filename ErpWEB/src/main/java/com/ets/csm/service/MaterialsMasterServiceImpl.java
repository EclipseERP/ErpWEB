package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.MaterialsMaster;
import com.ets.csm.repository.MaterialsMasterRepository;

@Service
public class MaterialsMasterServiceImpl implements MaterialsMasterService{

	@Autowired
	MaterialsMasterRepository materialsMasterRepository;
	
	
	@Override
	public List getAllMaterialsMaster() {
		
		return materialsMasterRepository.getAllMaterialsMaster();
	}

	@Override
	public List getAllMaterialsMasterBYid(Integer id) {
		
		return materialsMasterRepository.getAllMaterialsMasterid(id);
	}

	@Override
	public void saveMaterialsMaster(MaterialsMaster mat) {
		materialsMasterRepository.save(mat);
	}

	@Override
	public void removeCakePanMaster(MaterialsMaster mat) {
		materialsMasterRepository.delete(mat);
	}

	@Override
	public void saveOrUpdateMaterialsMaster(MaterialsMaster mat) {
		materialsMasterRepository.save(mat);
	}

}
