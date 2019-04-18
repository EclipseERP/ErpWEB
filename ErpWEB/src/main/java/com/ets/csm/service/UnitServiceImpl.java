package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CompanyDetails;
import com.ets.csm.model.Unit;
import com.ets.csm.repository.UnitRepository;

@Service
public class UnitServiceImpl implements UnitService{

	@Autowired
	UnitRepository unitRepository;
	
	@Override
	public List getAllUnit() {
		
		return unitRepository.getAllUnit();
	}

	@Override
	public List getAllUnitBYid(Integer id) {
		
		return unitRepository.getAllUnitByid(id);
	}
	
	@Override
	public Unit getUnit(Integer id) {
		
		return unitRepository.getUnit(id);
	}

	@Override
	public void saveUnit(Unit uni) {
		unitRepository.save(uni);
		
	}

	@Override
	public void removeUnit(Unit uni) {
		unitRepository.delete(uni);
		
	}
	
	
	

}
