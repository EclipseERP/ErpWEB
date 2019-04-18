package com.ets.csm.service;

import java.util.List;
import com.ets.csm.model.FillingRecipeMaster;

public interface FillingRecipeMasterService {
	
	public List getFillingRecipeMaster();
	 
	public List getFillingRecipeMasterByid(Integer id);
	
	public FillingRecipeMaster getFillingRecipe(Integer id);
	 
	public void saveFillingRecipeMaster(FillingRecipeMaster rcm);
	
	public void removeFillingRecipeMaster(FillingRecipeMaster rcm);
	
	public List getFillingRecipeByMaxid();

}
