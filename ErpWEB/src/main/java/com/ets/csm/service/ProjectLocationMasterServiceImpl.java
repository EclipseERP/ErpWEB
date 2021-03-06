package com.ets.csm.service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ets.csm.model.ProjectLocationMaster;
import com.ets.csm.model.RawMaterials;
import com.ets.csm.repository.ProjectLocationMasterRepository;
import com.ets.csm.repository.RawMaterialsRepository;
@Service
public class ProjectLocationMasterServiceImpl implements ProjectLocationMasterService {

	@Autowired
	ProjectLocationMasterRepository plocrepository;
	@Override
	public ProjectLocationMaster saveOrUpdate(ProjectLocationMaster p) {
		// TODO Auto-generated method stub
		return plocrepository.save(p);
	}
	@Override
	public List getAllProjectLocationMaster(String projectlocation,String projectcode) {
		// TODO Auto-generated method stub
		
		return plocrepository.getAllProjectLocation(projectlocation,projectcode);
	}

}
