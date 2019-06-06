package com.ets.csm.service;
import java.util.Date;
import java.util.List;

import com.ets.csm.model.ProjectEIWorkMaster;
import com.ets.csm.model.ProjectLocationMaster;

public interface ProjectEIWorkMasterService 
{
	public ProjectEIWorkMaster saveOrUpdate(ProjectEIWorkMaster p);
	public List  getProjectEiWorkDetailsByProjectCode(String projectcode,String itemcode);

}
