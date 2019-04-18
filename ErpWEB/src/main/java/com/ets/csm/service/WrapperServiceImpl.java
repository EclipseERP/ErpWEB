package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.WrapperList;
import com.ets.csm.repository.WrapperRpository;

@Service
public class WrapperServiceImpl implements WrapperService {

	@Autowired
	private WrapperRpository wrapperRpository;			
	
	@Override
	public List getAllWrappers() {
		
		return wrapperRpository.getAllWrappers();
	}

	@Override
	public List getAllWrappersById(Integer id) {
		return wrapperRpository.getAllWrappersById(id);
	}

	@Override
	public void saveWrap(WrapperList wrap) {
		wrapperRpository.save(wrap);
		
	}

	@Override
	public void removeWrap(WrapperList wrap) {
		wrapperRpository.delete(wrap);
		
	}

	@Override
	public void saveOrUpdateWrap(WrapperList wrap) {
		wrapperRpository.save(wrap);
		
	}

}
