package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.IcingIngredientUser;
import com.ets.csm.repository.IcingIngredientUserRepository;

@Service
public class IcingIngredientUserServiceImpl implements IcingIngredientUserService{

	
	@Autowired
	IcingIngredientUserRepository icingIngredientUserRepository;

	@Override
	public List getAllIcingingredients() {
		
		return icingIngredientUserRepository.getAllIcingIngredientUser();
	}

	@Override
	public List getAllIcingingredientsBYid(Integer id) {
		
		return icingIngredientUserRepository.getAllIcingIngredientUserByid(id);
	}

	@Override
	public IcingIngredientUser getallIcingingredientsById(Integer id) {
		
		return icingIngredientUserRepository.getIcingIngredientUserbyId(id);
	}

	@Override
	public List getAllIcingingredientsBYIcingId(int icingId) {
		
		return icingIngredientUserRepository.getAllIcingIngredientUserByIcingId(icingId);
	}

	@Override
	public void save(IcingIngredientUser icing) {
		icingIngredientUserRepository.save(icing);
		
	}

	@Override
	public void remove(IcingIngredientUser icing) {
		icingIngredientUserRepository.delete(icing);
		
	}

	@Override
	public void saveOrUpdate(IcingIngredientUser icing) {
		icingIngredientUserRepository.save(icing);
		
	}
}
