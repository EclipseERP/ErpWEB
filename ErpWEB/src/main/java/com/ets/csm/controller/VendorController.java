package com.ets.csm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ets.csm.model.Vendor;
import com.ets.csm.service.VendorService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/vendorctrl")
public class VendorController {
	@Autowired
	VendorService vendorService;

	@GetMapping("/vendorPageload")
	public String vendorAdd()
	{
		return "/module/user/vendoradd";
	}
	
	@GetMapping("/vendorListPageload")
	public String vendorlistShow()
	{
		return "/module/user/vendorlist";
	}
	
	
	@GetMapping("/vendorDocPageload")
	public String vendorDocAdd()
	{
		return "/module/user/vendordocadd";
	}
	
	@GetMapping("/vendorDocListPageload")
	public String vendorDoclistShow()
	{
		return "/module/user/vendordoclist";
	}
	
	@PostMapping("/addVendorFormData")
	public @ResponseBody void addVendorData(@RequestBody Vendor v) {
		
	}
	
}
