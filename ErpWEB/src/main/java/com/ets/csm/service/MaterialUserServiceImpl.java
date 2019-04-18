package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.MaterialsUser;
import com.ets.csm.repository.MaterialsUserRepository;

@Service
public class MaterialUserServiceImpl implements MaterialUserService{
	
	@Autowired
	MaterialsUserRepository materialsUserRepository;

	@Override
	public List getAllMaterialUser() {
		
		return materialsUserRepository.getAllMaterialsUser();
	}

	@Override
	public List getAllMaterialUserBYid(Integer id) {
		
		return materialsUserRepository.getAllMaterialsUserByid(id);
	}

	@Override
	public MaterialsUser getallMaterialUserById(Integer id) {
		
		return materialsUserRepository.getallMaterialsUserById(id);
	}

	@Override
	public List getAllMaterialUserBYUsername(String username) {
		
		return materialsUserRepository.getAllMaterialsUserByUsername(username);
		//return null;
	}

	@Override
	public void saveMaterialUser(MaterialsUser mtu) {
		materialsUserRepository.save(mtu);
		
	}

	@Override
	public void removeMaterialUser(MaterialsUser mtu) {
		materialsUserRepository.delete(mtu);
		
	}

	@Override
	public void saveOrUpdateMaterialUser(MaterialsUser mtu) {
		materialsUserRepository.save(mtu);
		
	}

	@Override
	public List tierMaterialsUser(String username) {
		return materialsUserRepository.tierMaterialsUser(username);
	}

}
