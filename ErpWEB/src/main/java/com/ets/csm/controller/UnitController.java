package com.ets.csm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.ets.csm.model.Unit;
import com.ets.csm.service.UnitService;

@Controller
@RequestMapping("/unit")
public class UnitController {
	
	@Autowired
	UnitService unitService;
	
	@GetMapping("/allunits")
	public @ResponseBody List allunits(){
		return unitService.getAllUnit();
	}
	
	
	@GetMapping("/allunitsById/{id}")
	public @ResponseBody List allunitsById(Integer id) {
		return unitService.getAllUnitBYid(id);
	}
	
	@PostMapping("/addunits")
	public @ResponseBody void addunits(@RequestBody Unit uni) {
		unitService.saveUnit(uni);
		
	}
	
	@PostMapping("/deleteunits")
	public @ResponseBody void delunits(@RequestBody Unit uni) {
		unitService.removeUnit(uni);
	}
	 

}
