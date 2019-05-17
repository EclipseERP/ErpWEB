package com.ets.csm.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Vendor;
import com.ets.csm.model.VendorDoc;
import com.ets.csm.repository.VendorDocRepository;
import com.ets.csm.repository.VendorRepository;
@Service
public class VendorDocServiceImpl implements VendorDocService {
	@Autowired
	VendorDocRepository vendorDocRepository;
	
	@Override
	public void saveVendorDocData(VendorDoc vendorDoc) {
		// TODO Auto-generated method stub
		vendorDocRepository.save(vendorDoc);
	}
	@Override
	public List getAllVendorDocs()
	{
		return vendorDocRepository.getAllVendorDocs();
	}
	
	
	
	

}
