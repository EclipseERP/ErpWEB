package com.ets.csm.service;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Vendor;
import com.ets.csm.repository.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	VendorRepository vendorRepository;
	
	
	@Override
	public void saveOrUpdate(Vendor ven) {
	vendorRepository.save(ven);
	}
	
}
