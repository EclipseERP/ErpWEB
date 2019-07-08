package com.ets.csm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import com.ets.csm.model.RawMaterials;
import com.ets.csm.model.User;
import com.ets.csm.model.Vendor;
import com.ets.csm.model.Venue;
import com.ets.csm.service.UserService;
import com.ets.csm.service.VendorService;
import com.ets.csm.service.VenueService;
import com.ets.csm.util.DateUtility;

@Controller
@RequestMapping("/vendorctrl")
public class VendorController {

	@Autowired
	VendorService vendorService;

	@Autowired
	UserService userService;

	@GetMapping("/vendorPageload")
	public String vendorAdd() {
		return "/module/user/vendoradd";
	}

	@GetMapping("/vendorListPageload")
	public String vendorlistShow() {
		return "/module/user/vendorlist";
	}

	@GetMapping("/vendorDocPageload")
	public String vendorDocAdd() {
		return "/module/user/vendordocadd";
	}

	@GetMapping("/vendorDocListPageload")
	public String vendorDoclistShow() {
		return "/module/user/vendordoclist";
	}

	@PostMapping("/addVendorFormData")
	public @ResponseBody void addVendorData(@RequestBody Vendor v) {

	}

	@PostMapping("/addVendor/{userName}")
	public @ResponseBody void saveVendor(@RequestBody Vendor ven, @PathVariable String userName) {
		User user = userService.getUserByUserName(userName);
		ven.setUser(user);
		vendorService.saveVendorData(ven);

	}

	@GetMapping("/getVendorDetails")
	public @ResponseBody List getVendorList() {

		return vendorService.getAllVendors();
	}

	@GetMapping("/getVendorDetailsByVendorid/{vendorid}")
	public @ResponseBody Vendor getVendorDetailsByVendorid(@PathVariable int vendorid) {

		return vendorService.getSupplyDetailsBySupplyid(vendorid);
	}

	@GetMapping("/getVendorCode")
	public @ResponseBody Object getVendorCode() {
		Object code = vendorService.getAllVendors().size() + 1;
		return code;

	}

}
