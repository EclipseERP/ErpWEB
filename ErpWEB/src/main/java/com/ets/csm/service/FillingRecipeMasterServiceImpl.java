package com.ets.csm.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ets.csm.model.FillingRecipeMaster;
import com.ets.csm.repository.FillingRecipeMasterRepository;

@Service
public class FillingRecipeMasterServiceImpl implements FillingRecipeMasterService{

	@Autowired
	FillingRecipeMasterRepository fillingRecipeMasterRepository;

	@Override
	public List getFillingRecipeMaster() {
		return fillingRecipeMasterRepository.getFillingRecipeMaster();
	}

	@Override
	public List getFillingRecipeMasterByid(Integer id) {
		return fillingRecipeMasterRepository.getFillingRecipeMasterByid(id);
	}

	@Override
	public FillingRecipeMaster getFillingRecipe(Integer id) {
		
		return fillingRecipeMasterRepository.getFillingRecipe(id);
	}

	@Override
	public void saveFillingRecipeMaster(FillingRecipeMaster rcm) {
		fillingRecipeMasterRepository.save(rcm);
	}

	@Override
	public void removeFillingRecipeMaster(FillingRecipeMaster rcm) {
		fillingRecipeMasterRepository.delete(rcm);
	}

	@Override
	public List getFillingRecipeByMaxid() {
		return fillingRecipeMasterRepository.getFillingRecipeByMaxid();
	}
	
	



}
