package com.ets.csm.service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ets.csm.model.ProjectEIWorkMaster;
import com.ets.csm.model.RawMaterials;
import com.ets.csm.repository.ProjectEIWorkRepository;
import com.ets.csm.repository.RawMaterialsRepository;
@Service

public class ProjectEIWorkMasterServiceImpl implements ProjectEIWorkMasterService {

	@Autowired
	ProjectEIWorkRepository projecteirepository;
	
	@Override
	public ProjectEIWorkMaster saveOrUpdate(ProjectEIWorkMaster p) {
		// TODO Auto-generated method stub
		return projecteirepository.save(p);
	}

	@Override
	public List getProjectEiWorkDetailsByProjectCode(String projectcode, String itemcode) {
		// TODO Auto-generated method stub
		return projecteirepository.getProjectEIWorkByProjectCode(projectcode,itemcode);
	}

}
