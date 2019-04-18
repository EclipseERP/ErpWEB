package com.ets.csm.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ets.csm.model.FillingPurchaseMaster;
import com.ets.csm.repository.FillingPurchaseMasterRepository;

@Service
public class FillingPurchaseMasterServiceImpl implements FillingPurchaseMasterService{

	@Autowired
	FillingPurchaseMasterRepository fillingPurchaseMasterRepository;
	
	@Override
	public List getAllFillingPurchaseMaster() {
		
		return fillingPurchaseMasterRepository.getAllFillingPurchaseMaster();
	}

	@Override
	public List getAllFillingPurchaseMasterByid(Integer id) {
		
		return fillingPurchaseMasterRepository.getAllFillingPurchaseMasterByid(id);
	}

	@Override
	public void saveFillingPurchaseMaster(FillingPurchaseMaster ing) {
		fillingPurchaseMasterRepository.save(ing);
		
	}

	@Override
	public void removeFillingPurchaseMaster(FillingPurchaseMaster ing) {
		fillingPurchaseMasterRepository.delete(ing);
		
	}

	
}
