package com.ets.csm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ets.csm.model.Payment;
import com.ets.csm.model.Projects;

import com.ets.csm.service.AccountsService;
import com.ets.csm.service.PaymentServiceImpl;
import com.ets.csm.service.ProjectsService;

import com.ets.csm.service.UserService;

@Controller
@RequestMapping("/accounts")
public class AccountsController {
	@Autowired
	AccountsService accountsService;
	@Autowired
	PaymentServiceImpl paymentService;
	
	@Autowired
	ProjectsService projectservice;
	
	@GetMapping("/")
	public String accounts() {
		
		return "/module/accounts/accountsParrent";
	
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		
		return "/module/accounts/dashboard";
	
	}
	
	@GetMapping("/turnover")
	public String addTurnover() {
		return "/module/user/turnoveradd";
	
	}
	
	@PostMapping("/saveturnover")
	@ResponseBody
	public void saveTurnOver(@RequestBody Payment turnover) {
		 paymentService.save(turnover);
	}
	
	
	@GetMapping("/accountsListPageload")
	public String projectlistShow() {
		return "/module/user/projectsList";
	}
	
	@GetMapping("/paymentsPage")
	public String paymentsList() {
		return "/module/user/paymentsList";
	}
	
	@GetMapping("/allPaymentsPage")
	public String allPaymentsList() {
		return "/module/user/AllpaymentsList";
	}
	
	@GetMapping("/payments")
	@ResponseBody
	public List<Payment> getAllPayments() {
		return paymentService.findAllPayements();
	}
	
	@GetMapping("/payments/{project_id}")
	@ResponseBody
	public List<Payment> getAllPaymentsByPId(@PathVariable Long project_id) {
		return paymentService.findAllPaymentsByProjectId(project_id);
	}
	
	@GetMapping("/payments/delete/{project_id}")
	@ResponseBody
	public void deleteById(@PathVariable Long project_id) {
		paymentService.deletePaymentsByProjectId(project_id);
	}
	
	
	
	@GetMapping("/getProjectDetailsForTurnoverPageGroupByProjectCode")
	public @ResponseBody List getProjectDetailsGroupByProjectCode() {

		return projectservice.getProjectGroupByProjectCode();

	}
	
	
	
	
	
	
	
	

}
