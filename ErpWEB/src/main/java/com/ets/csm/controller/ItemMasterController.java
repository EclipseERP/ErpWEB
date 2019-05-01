package com.ets.csm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ets.csm.service.ItemService;

@Controller
@RequestMapping("/itemctrl")
public class ItemMasterController {
   /* @Autowired */
    ItemService itemservice; 
	
	
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
	
	
	@GetMapping("/getItem")
	public @ResponseBody List getItemList() {
		return itemservice.getAllItems();
	}
	/*@GetMapping("/getItemByID")
	public @ResponseBody List getItemListByID(int id) {
		return itemservice.getAllItemsByID(id);
	} */
	
}
