package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.Vendor;
import com.ets.csm.model.Venue;

public interface VendorService {

	public void saveOrUpdate(Vendor ven);

	public List getAllVendors();

}
