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
@RequestMapping("/vendorDocCtrl")
public class VendorDocumentController {
	/*@Autowired
	VendorDocService vendorDocService;
	
	@PostMapping("/addVendorDoc/{userName}")
	public @ResponseBody void saveVendor(@RequestBody Vendor ven, @PathVariable String userName) {
		User user = userService.getUserByUserName(userName);
		ven.setUser(user);
		vendorDocService.saveVendorDocData(ven);
		
	}*/
}
