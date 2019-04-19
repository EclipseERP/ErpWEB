package com.ets.csm.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Cake;
import com.ets.csm.model.Vendor;

@Repository("vendorRepository")
public interface VendorRepository extends JpaRepository<Vendor, Integer>{

}
