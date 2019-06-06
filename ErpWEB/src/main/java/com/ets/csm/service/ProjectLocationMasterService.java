package com.ets.csm.service;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ets.csm.model.ProjectLocationMaster;
import com.ets.csm.model.Projects;
import com.ets.csm.model.RawMaterials;

public interface ProjectLocationMasterService {

	public ProjectLocationMaster saveOrUpdate(ProjectLocationMaster p);
	public List  getAllProjectLocationMaster(String projectlocation,String projectcode);
	
}
