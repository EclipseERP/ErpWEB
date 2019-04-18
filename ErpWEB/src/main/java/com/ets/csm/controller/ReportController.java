package com.ets.csm.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ets.csm.model.IngredientsUser;
import com.ets.csm.service.IngredientsUserService;
import com.ets.csm.service.OrderManageService;
import com.ets.csm.service.ReferralService;

@Controller
@RequestMapping("/reports")
public class ReportController {
	
	@Autowired
	IngredientsUserService ingredientsUserService;
	OrderManageService orderManageService;
	
	
	@GetMapping("/bakingReports")
	public String bakingReport() {
    return "/module/user/cakeBakingReports";
	}
	
	
	
	@GetMapping("/ingredeintsReport")
	public String ingredientReport() {
	return "/module/user/cakeIngredientsList";
	}
	
	
	
	
	
	@GetMapping("/returnableListReports")
	public String returnableList() {
	return "/module/user/cakeReturnableItems";
	}
	
	
	
	
	@GetMapping("/cakeDecoratingInstructions")
	public String decoratingReport() {
	return "/module/user/cakeDecoratingReport";
	}
	
	
	
	@GetMapping("/sale")
	public String salesReport() {
	return "/module/user/cakeSalesReport";
	}
	
	
	
	@GetMapping("/cupBakingReports")
	public String cupBakingReport() {
    return "/module/user/cupBakingReports";
	}
	
	
	
	@GetMapping("/cupIngredeintsReport")
	public String cupIngredientReport() {
	return "/module/user/cupIngredientsList";
	}
	
	
	
	@GetMapping("/cupReturnableListReports")
	public String cupReturnableList() {
	return "/module/user/cupCakesReturnableItems";
	}
	
	
	
	
	@GetMapping("/cupCakeDecoratingInstructions")
	public String cupDecoratingReport() {
	return "/module/user/cupDecoratingReport";
	}
	
	
	
	@GetMapping("/cupSale")
	public String cupSalesReport() {
	return "/module/user/cupSalesReport";
	}
	
	
	
	@GetMapping("/referral")
	public String referralReports() {
	return "/module/user/referralReport";
	}
	
	/*getIngredientData*/
	
	@GetMapping("/getIngredientData/{userName}")
	public @ResponseBody List getIngredientData(@PathVariable String userName) {
		return ingredientsUserService.getAllBYUsername(userName);
	}
	
	/*@GetMapping("/getIngredientDataByDate/{userName}/{fromDate}")
	public List ingredientReportByDate(@PathVariable String fromDate,@PathVariable String userName) throws Throwable {
	
		Date dob= new SimpleDateFormat("yyyy-MM-dd").parse(fromDate);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%"+dob);
		List<IngredientsUser> ingrdList = new ArrayList<IngredientsUser>(ingredientsUserService.getAll());
		
		Iterator<IngredientsUser> itr = ingrdList.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next().getCreateDate());
		}
		
		
		
		
		return ingredientsUserService.getAll();
	}*/
	
	@GetMapping("/getBakingData/{userName}")
	public @ResponseBody List getBakingData(@PathVariable String userName) {
		return ingredientsUserService.getAllBYUsername(userName);
	}
	
	
	@GetMapping("/getCupIngredientData/{userName}")
	public @ResponseBody List getCupIngredientData(@PathVariable String userName) {
		return ingredientsUserService.getAllBYUsername(userName);
	}
}
