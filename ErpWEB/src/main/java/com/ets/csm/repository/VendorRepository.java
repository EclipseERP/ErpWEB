package com.ets.csm.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Cake;
import com.ets.csm.model.Vendor;


@Repository("vendorRepository")
public interface VendorRepository extends JpaRepository<Vendor, Integer>{

	@Query("SELECT V FROM Vendor V order by V.id")
	public List getAllVendors();
	
	@Query("SELECT V FROM Vendor V where V.id=:id")
	public Vendor getVendorByvendorID(@Param ("id") Integer id);
}
