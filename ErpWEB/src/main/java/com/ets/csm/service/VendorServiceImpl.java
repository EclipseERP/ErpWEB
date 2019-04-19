package com.ets.csm.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Vendor;
import com.ets.csm.repository.VendorRepository;
import com.ets.csm.repository.VenueRepository;

@Service
public class VendorServiceImpl implements VendorService {
	
	
	
	@Autowired
	private VendorRepository vendorRepository;
	
	
	@Override
	public Vendor saveOrUpdate(Vendor ven) {
		return  vendorRepository.save(ven);
	}
	
}
