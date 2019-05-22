package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.ProjectStockRecordMaster;
import com.ets.csm.repository.projectStockMasterRepository;

@Service
public class ProjectStockRecordMasterImpl implements ProjectStockMasterService {

	
	@Autowired
	projectStockMasterRepository projectstocrepo;
	
	@Override
	public void saveorUpdate(ProjectStockRecordMaster wu) {
		// TODO Auto-generated method stub
		
		projectstocrepo.save(wu);
		
	}

	@Override
	public List getProjectStockDetailsByProjectcode(String projectcode) {
		// TODO Auto-generated method stub
		return projectstocrepo.getAllProjectsStockByProjectcode(projectcode);
	}

	@Override
	public ProjectStockRecordMaster getProjectStockDataByItemdandProjectCode(String projectcode,String itemcode)
	{
		return projectstocrepo.getProjectsStockByProjectcodeAndItemcode(projectcode, itemcode);
	}
	
	
}
