package com.ets.csm.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ets.csm.model.Cake;
import com.ets.csm.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer>{
	
	
	
}
