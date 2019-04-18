package com.ets.csm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vendorctrl")
public class VendorController {

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
	
	
}
