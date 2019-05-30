package com.ets.csm.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ets.csm.model.User;
import com.ets.csm.service.UserService;

@Controller
@RequestMapping("/adminHelp")
public class AdminHelpContentsController {
	
	@GetMapping("/addSettings")
	public String userManagementAction() {
		return "/module/admin/settingsMyAccount";
	}
	
/*	
	@GetMapping("/openTenderList")
	public String openTenderList() {
		return "/module/admin/tenderlist";
	}
	*/
	
	
	
	@GetMapping("/addTheme")
	public String userManagementActionn() {
		return "/module/admin/themesMyAccount";
	}
	
	@GetMapping("/addLogo")
	public String logofunc() {
		return "/module/admin/logoMyAccount";
	}
	
	@GetMapping("/addSocial")
	public String socialfunc() {
		return "/module/admin/socialMyAccount";
	}

	@GetMapping("/addPayment")
	public String paymentfunc() {
		return "/module/admin/paymentMyAccount";
	}
	
	@GetMapping("/addPaymentPrior")
	public String paymentPriorfunc() {
		return "/module/admin/paymentpriorMyAccount";
	}
	
	@GetMapping("/addOrder")
	public String orderfunc() {
		return "/module/admin/orderMyAccount";
	}
	
	@GetMapping("/addOrderPrior")
	public String orderPriorfunc() {
		return "/module/admin/orderPiorMyAccount";
	}
	
	@GetMapping("/addQuote")
	public String quotefunc() {
		return "/module/admin/quoteMyAccount";
	}
	
	@GetMapping("/addQuotePrior")
	public String quotePriorfunc() {
		return "/module/admin/quotePriorMyAccount";
	}
	
	@GetMapping("/addAppointment")
	public String appointmentfunc() {
		return "/module/admin/appointmentMyAccount";
	}
	
	@GetMapping("/addAppointmentPrior")
	public String appointmentPriorfunc() {
		return "/module/admin/appointmentPriorMyAccount";
	}
	
	@GetMapping("/addEvent")
	public String eventfunc() {
		return "/module/admin/eventMyAccount";
	}
	
	@GetMapping("/addEventPrior")
	public String eventPriorfunc() {
		return "/module/admin/eventPriorMyAccount";
	}
	
	@GetMapping("/addCustomerList")
	public String customerListfunc() {
		return "/module/admin/customerListMyAccount";
	}
	
	@GetMapping("/addCustomer")
	public String customerfunc() {
		return "/module/admin/AddCustomerHelp";
	}
	
	@GetMapping("/addVenueList")
	public String venueListfunc() {
		return "/module/admin/venueListMyAccount";
	}
	
	@GetMapping("/addVenue")
	public String addVenuefunc() {
		return "/module/admin/addVenueMyAccount";
	}
	
	@GetMapping("/addEventLists")
	public String eventListsfunc() {
		return "/module/admin/eventListsMyAccount";
	}
	
	@GetMapping("/addEvents")
	public String addEventfunc() {
		return "/module/admin/addEventsMyAccount";
	}
	
	@GetMapping("/addCake")
	public String addCakefunc() {
		return "/module/admin/addCakeMyAccount";
	}
	
	@GetMapping("/addWeddingCake")
	public String addWeddingCakefunc() {
		return "/module/admin/addWeddingCakeMyAccount";
	}
	
	@GetMapping("/addPartyCake")
	public String addPartyCakefunc() {
		return "/module/admin/addPartyCakeMyAccount";
	}
	
	@GetMapping("/addOrderType")
	public String addOrderTypefunc() {
		return "/module/admin/orderTypeMyAccount";
	}
	
	@GetMapping("/addCakeType")
	public String addCakeTypefunc() {
		return "/module/admin/cakeTypeMyAccount";
	}
	
	@GetMapping("/predefinedType")
	public String predefinedTypefunc() {
		return "/module/admin/predefinedTypeMyAccount";
	}
	
	@GetMapping("/buildCake")
	public String buildCakeTypefunc() {
		return "/module/admin/buildCakeeMyAccount";
	}
	
	
	
	@GetMapping("/selectPredefinedCake")
	public String selectPredefinedCakeTypefunc() {
		return "/module/admin/selectPredefinedCakeMyAccount";
	}
	
	
	@GetMapping("/eventsAdd")
	public String eventsAddTypefunc() {
		return "/module/admin/eventssMyAccount";
	}
	
	
	
	
	
	@GetMapping("/cupCakeList")
	public String cupCakeListfunc() {
		return "/module/admin/cupCakeListMyAccount";
	}
	
	@GetMapping("/cupCakeAdd")
	public String cupCakeAddfunc() {
		return "/module/admin/cupCakeAddMyAccount";
	}
	
	
	@GetMapping("/priceList")
	public String priceListfunc() {
		return "/module/admin/priceListMyAccount";
	}
	
	
	@GetMapping("/priceAdd")
	public String priceAddfunc() {
		return "/module/admin/priceAddMyAccount";
	}
	
	
	@GetMapping("/recipePriceList")
	public String recipePriceListfunc() {
		return "/module/admin/recipePriceListMyAccount";
	}
	
	@GetMapping("/recipePriceAdd")
	public String recipePriceAddfunc() {
		return "/module/admin/recipePriceAddMyAccount";
	}
	
	
	@GetMapping("/icingPriceList")
	public String icingPriceListfunc() {
		return "/module/admin/icingPriceListMyAccount";
	}
	
	
	@GetMapping("/icingPriceAdd")
	public String icingPriceAddfunc() {
		return "/module/admin/icingPriceAddMyAccount";
	}
	
	
	@GetMapping("/fillingsPriceList")
	public String fillingsPriceListfunc() {
		return "/module/admin/fillingsPriceListMyAccount";
	}
	
	@GetMapping("/fillingsPriceAdd")
	public String fillingsPriceAddfunc() {
		return "/module/admin/fillingsPriceAddMyAccount";
	}
	
	@GetMapping("/toppingPriceList")
	public String toppingPriceListfunc() {
		return "/module/admin/toppingPriceListMyAccount";
	}
	
	@GetMapping("/toppingPriceAdd")
	public String toppingPriceAddfunc() {
		return "/module/admin/toppingPriceAddMyAccount";
	}
	
	@GetMapping("/wrapperPriceList")
	public String wrappperPriceListfunc() {
		return "/module/admin/wrapperPriceListMyAccount";
	}
	
	@GetMapping("/wrapperPriceAdd")
	public String wrappperPriceAddfunc() {
		return "/module/admin/wrapperPriceAddMyAccount";
	}
	
	@GetMapping("/materialsList")
	public String materialsListfunc() {
		return "/module/admin/materialsListMyAccount";
	}
	
	@GetMapping("/materialsAdd")
	public String materialsAddfunc() {
		return "/module/admin/materialsAddMyAccount";
	}
	
	@GetMapping("/ingredientsList")
	public String ingredientsListfunc() {
		return "/module/admin/ingredientsListMyAccount";
	}
	
	@GetMapping("/ingredientsAdd")
	public String ingredientsAddfunc() {
		return "/module/admin/ingredientsAddMyAccount";
	}
	
	@GetMapping("/recipeeList")
	public String recipeeListfunc() {
		return "/module/admin/recipeeListMyAccount";
	}
	
	@GetMapping("/recipeeAdd")
	public String recipeeAddfunc() {
		return "/module/admin/recipeeAddMyAccount";
	}
	
	@GetMapping("/ordersList")
	public String ordersListfunc() {
		return "/module/admin/ordersListMyAccount";
	}
	
	@GetMapping("/ordersAdd")
	public String ordersAddfunc() {
		return "/module/admin/ordersAddMyAccount";
	}
	
	@GetMapping("/companyInfo")
	public String companyInfofunc() {
		return "/module/admin/companyInfoMyAccount";
	}
	
	@GetMapping("/cakePansLists")
	public String cakePansList() {
		return "/module/admin/cakePansListMyAccount";
	}
	
	@GetMapping("/addNewCakePansLists")
	public String addNewCakePansList() {
		return "/module/admin/addNewCakePansList";
	}


}
