package com.ets.csm.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Vendor;
import com.ets.csm.model.VendorDoc;

@Repository("vendorDocRepository")
public interface VendorDocRepository extends JpaRepository<VendorDoc, Integer>{

	@Query("SELECT VD FROM VendorDoc VD order by VD.id")
	public List getAllVendorDocs();

}
