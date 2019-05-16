package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.ProjectStockRecordMaster;
import com.ets.csm.model.WrapperUser;

public interface ProjectStockMasterService {
	
	public void saveorUpdate(ProjectStockRecordMaster wu);
	public List getProjectStockDetailsByProjectcode(String projectcode);
}
