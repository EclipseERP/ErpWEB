package com.ets.csm.controller;
import java.util.List;
import org.springframework.stereotype.Controller;

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
import com.ets.csm.model.VendorDoc;
import com.ets.csm.service.UserService;
import com.ets.csm.service.VendorDocService;
import com.ets.csm.util.DateUtility;

@Controller
@RequestMapping("/vendorDocCtrl")
public class VendorDocumentController {
	@Autowired
	VendorDocService vendorDocService;
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addVendorDoc/{userName}")
	public @ResponseBody void saveVendor(@RequestBody VendorDoc vendorDoc, @PathVariable String userName) {
		User user = userService.getUserByUserName(userName);
		vendorDoc.setUser(user);
		vendorDocService.saveVendorDocData(vendorDoc);
	}
		
		
		@GetMapping("/getVendorDocDetails")
		public @ResponseBody List getVendorDocList() {
			return vendorDocService.getAllVendorDocs();
		}
		
		
		
		
	
}
