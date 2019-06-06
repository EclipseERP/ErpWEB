package com.ets.csm.service;
import java.util.List;
import com.ets.csm.model.VendorDoc;

public interface VendorDocService {
	public void saveVendorDocData(VendorDoc vendorDoc);
	public List getAllVendorDocs();
}
