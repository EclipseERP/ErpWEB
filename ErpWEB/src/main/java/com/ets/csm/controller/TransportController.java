package com.ets.csm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ets.csm.model.Transport;
import com.ets.csm.service.TransportService;

@Controller
@RequestMapping(value="/transport")
public class TransportController {
	@Autowired
	TransportService transportService;
	
	@GetMapping
	public String getTransportPage() {
		return "/module/user/TransportList";
	}
	
	@GetMapping("/add")
	public String getAddTransportPage() {
	
	
		return "/module/user/addTransport";
	}
	
	@GetMapping("/all")
	@ResponseBody
	public List<Transport> getallTransportPage() {
	
	
		return transportService.getAll();
	}
	
	@PostMapping("/saveTransport")
	@ResponseBody
	public void saveTransport(@RequestBody Transport transport) {
		
		transportService.save(transport);
	}
	@GetMapping("/getLastId")
	@ResponseBody
	public Long getLastId() {
	return 	transportService.getFirstId();
	}

	
}
