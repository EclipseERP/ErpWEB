package com.ets.csm.service;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ets.csm.model.RawMaterials;

public interface RawMaterialsService {

	public RawMaterials saveOrUpdate(RawMaterials rm);
	public void saveItemData(RawMaterials raw);
	public List getAllRawMaterials();
}
