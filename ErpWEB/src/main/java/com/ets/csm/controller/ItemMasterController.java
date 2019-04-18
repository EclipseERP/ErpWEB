package com.ets.csm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itemctrl")
public class ItemMasterController {

	
	@GetMapping("/itemPageload")
	public String itemAdd()
	{
		return "/module/user/item";
	}
	
	@GetMapping("/itemListPageload")
	public String itemlistShow()
	{
		return "/module/user/itemlist";
	}
	
	
}
