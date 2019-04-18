package com.ets.csm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ets.csm.model.Customer;
import com.ets.csm.model.Subscription;
import com.ets.csm.model.User;
import com.ets.csm.service.CustomerService;
import com.ets.csm.service.ReferralService;
import com.ets.csm.service.UserService;
import com.ets.csm.util.DateUtility;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	UserService userService;
	@Autowired
	ReferralService reffaralservice;
	
	@GetMapping("/customerPage")
	public String customerAction() {
		return "/module/user/customer";
	}
	
	@GetMapping("/allCustomers")
	public @ResponseBody List allCustomers() {
		return customerService.getAllCustomer();
	}
	
	@GetMapping("/allCustomersByUserId/{currentUserName}")
	public @ResponseBody List customersByUserId(@PathVariable String currentUserName) {
		return customerService.getAllCustomerBYUserid(currentUserName);
	}
	
	@PostMapping("/addCustomer/{currentUserName}/{bridename}/{refferalid}/{groomname}")
	public @ResponseBody void saveCustomer(@RequestBody Customer cus, @PathVariable String currentUserName,@PathVariable String bridename
			,@PathVariable int refferalid,@PathVariable String groomname) {
		User user = userService.getUserByUserName(currentUserName);
		cus.setUser(user);
		cus.setBrideName(bridename);
		cus.setGroomName(groomname);
		cus.setReferral(reffaralservice.getAllReferralDataById(refferalid));
		cus.setCreatedAt(DateUtility.getCurrentDateWithTime());
		customerService.saveCustomer(cus);
	}
	
	@PostMapping("/delCustomer")
	public @ResponseBody void deleteCustomer(@RequestBody Customer cus) {
		customerService.removeCustomer(cus);
	}
	
	
	
	/*@PostMapping("/updateCustomer/{currentUserName}")
	public @ResponseBody void updateCustomer(@RequestBody Customer cus,
			@PathVariable String currentUserName,
			@RequestParam("bridename") String bridename,
			@RequestParam("groomname") String groomname
			) {
		User user = userService.getUserByUserName(currentUserName);
		cus.setUser(user);
		cus.setBrideName(bridename);
		cus.setGroomName(groomname);
		customerService.saveOrUpdate(cus);
	}*/
	
	
	
	
	@PostMapping("/updateCustomer/{currentUserName}/{bridename}/{groomname}")
	public @ResponseBody void updateCustomer(@RequestBody Customer cus,
			@PathVariable String currentUserName,@PathVariable String bridename,@PathVariable String groomname
	
			) {
		System.out.println("called.............");
		
		User user = userService.getUserByUserName(currentUserName);
		cus.setUser(user);
		cus.setBrideName(bridename);
		cus.setGroomName(groomname);
		customerService.saveOrUpdate(cus);
		
	}

	
	@GetMapping("/totalCustomers/{currentUserName}")
	public @ResponseBody int totalCustomers(@PathVariable String currentUserName) {
		return customerService.totalCustomers(currentUserName);
	}
	
	
	
}
