package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.Unit;

public interface UnitService {
	
	public List getAllUnit();
	 
	public List getAllUnitBYid(Integer id);
	
	public Unit getUnit(Integer id);
	 
	public void saveUnit(Unit uni);
	
	public void removeUnit(Unit uni);

}
