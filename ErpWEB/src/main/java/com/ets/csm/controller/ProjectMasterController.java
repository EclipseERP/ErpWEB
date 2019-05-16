package com.ets.csm.controller;

import java.util.ArrayList;
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

import com.ets.csm.dto.ProjectItemCodeListDTO;
import com.ets.csm.model.ProjectEIWorkMaster;
import com.ets.csm.model.ProjectLocationMaster;
import com.ets.csm.model.ProjectStockRecordMaster;
import com.ets.csm.model.Projects;
import com.ets.csm.model.User;
import com.ets.csm.service.ProjectEIWorkMasterService;
import com.ets.csm.service.ProjectLocationMasterService;
import com.ets.csm.service.ProjectStockMasterService;
import com.ets.csm.service.ProjectsService;
import com.ets.csm.service.UserService;
import com.ets.csm.util.DateUtility;

@Controller
@RequestMapping("/project")

public class ProjectMasterController {
	@Autowired
	UserService userService;

	@Autowired
	ProjectsService projectservice;

	@Autowired
	ProjectLocationMasterService projectlocationservice;

	@Autowired
	ProjectEIWorkMasterService projecteiservice;

	@Autowired
	ProjectStockMasterService projectstockmasterservice;
	


	@GetMapping("/getProjects")
	public @ResponseBody List getProjectList() {
		return projectservice.getAllProjects();
	}

	@GetMapping("/getProjectsByID")
	public @ResponseBody List getProjectListByID(int id) {
		return projectservice.getAllProjectsByID(id);
	}

	@GetMapping("/projectListPageload")
	public String projectlistShow() {
		return "/module/user/projectlist";
	}

	@GetMapping("/projectPageload")
	public String projectAdd() {
		return "/module/user/projectadd";
	}
	
	@GetMapping("/projectItemViewload")
	public String projectItemViewLoad() {
		return "/module/user/projectItemView";
	}
	
	

	// +++++++++++++++++++ Tender Creation method starts
	// here +++++++++++++++++++++++++++++++++++++++++++

	@PostMapping("/saveProject/{userName}")
	public @ResponseBody void saveProject(@PathVariable String userName,
			@RequestParam("projectLocationlist") String[] projectLocationlist,
			@RequestParam("projectLocationlistSCHQTY") String[] projectLocationlistSCHQTY,
			@RequestParam("addEiworklist") String[] addEiworklist,
			@RequestParam("addEiworklistQTY") String[] addEiworklistQTY,
			@RequestParam("itemcodeslist") String[] itemcodeslist, @RequestParam("unitlist") String[] unitlist,
			@RequestParam("locationvaluelist") String[] locationvaluelist,
			@RequestParam("eiworksvaluelist") String[] eiworksvaluelist,
			@RequestParam("descriptionlist") String[] descriptionlist, @RequestParam("totallist") int[] totallist,
			@RequestParam("inslist") String[] inslist, @RequestParam("locflaglist") String[] locflaglist,
			@RequestParam("eiflaglist") String[] eiflaglist, @RequestParam("projectcode") String projectcode,
			@RequestParam("loa_details") String loadetails, @RequestParam("projectdetails") String projectdetails,@RequestParam("tendardate") String tenderdate) {

		try {
			
			
			
			for (int i = 0; i < projectLocationlist.length; i++) {

				Projects pdata = new Projects();
				pdata.setProject_code(projectcode);
				pdata.setLoa_no(loadetails);
				pdata.setProjectdetails(projectdetails);
				pdata.setProjectname(projectLocationlist[i]);
				pdata.setDate(tenderdate);
				pdata.setTotalqty(totallist[0]);
			
				projectservice.saveOrUpdate(pdata);
			}

			for (int k = 0; k < itemcodeslist.length; k++) 
			{
				
				ProjectStockRecordMaster pdatas = new ProjectStockRecordMaster();
				pdatas.setItemcode(itemcodeslist[k]);
				pdatas.setUnit(unitlist[k]);
				pdatas.setTotal(totallist[k]);
				pdatas.setIns(inslist[k]);
				pdatas.setProjectcode(projectcode);
				pdatas.setSchUnitRate(0);
				pdatas.setAmount("0");
				pdatas.setPercentageAbove("0");
				pdatas.setAllInclusiveRate("0");
				pdatas.setSupplierWithAddress("No Supplier");
				pdatas.setRate(0);
				pdatas.setIcDetails("No Data Available");
				pdatas.setSupplyQuantity("0");
				pdatas.setBalanceQuantity("0");
				pdatas.setPlaceOfDelivery("");
			    pdatas.setTruckNumber("");
			    pdatas.setTransporter("");
			    pdatas.setBillNo("");
			    pdatas.setBillQuantity(totallist[k]+"");
			    pdatas.setItemdescription(descriptionlist[k]);
			    
			   
				projectstockmasterservice.saveorUpdate(pdatas);
				
								
				
				for (int n = 0; n < addEiworklist.length; n++) {

					for (int m = 0; m < addEiworklistQTY.length; m++) {
						ProjectEIWorkMaster eiworks = new ProjectEIWorkMaster();
						if (eiflaglist[m].equalsIgnoreCase(addEiworklist[n])) {
							eiworks.setProject_code(projectcode);
							eiworks.setEiWorks(addEiworklist[n]);
							eiworks.setQuantity(addEiworklistQTY[m]);
							eiworks.setItemcode(itemcodeslist[k]);
							projecteiservice.saveOrUpdate(eiworks);
						}

					}
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			

			for (int j = 0; j < projectLocationlist.length; j++) {

				for (int l = 0; l < projectLocationlistSCHQTY.length; l++) {
					ProjectLocationMaster plocation = new ProjectLocationMaster();

					if (locflaglist[l].equalsIgnoreCase(projectLocationlist[j])) {
						plocation.setProjectcode(projectcode);
						plocation.setProjectLocation(projectLocationlist[j]);
						plocation.setSchQuantity(projectLocationlistSCHQTY[l]);
						projectlocationservice.saveOrUpdate(plocation);
					}

				}
			}

		

		} catch (ArrayIndexOutOfBoundsException d) {
			System.out.println("exception occur" + d);
		}
	}

	// +++++++++++++++++++++++++++++++++++++++++++++ Tender Creation method ends
	// here +++++++++++++++++++++++++++++++++++++++++++++++++++++

	@GetMapping("/getProjectCode")
	public @ResponseBody Object getProjectCode() 
	{
		Object code = projectservice.getAllProjects().size() + 1;
		return code;

	}
	
	@PostMapping("/getProjectItemDetailsByProjectcode")
	public @ResponseBody List getProjectItemDetailsByProjectcode(@RequestParam("projectcode") String projectcode,@RequestParam("projectlocation") String projectlocation) 
	{

	System.out.println(" "+projectcode);
	
	List projectstockdtolist=new ArrayList();
	
	List<ProjectStockRecordMaster> projetctstockmasterlist=projectstockmasterservice.getProjectStockDetailsByProjectcode(projectcode);
	List<ProjectLocationMaster> projectlist=projectlocationservice.getAllProjectLocationMaster(projectlocation,projectcode);
	
	for(int i=0;i<projetctstockmasterlist.size();i++)	
	{
			ProjectItemCodeListDTO pdto=new ProjectItemCodeListDTO();
			
			pdto.setItemcode(projetctstockmasterlist.get(i).getItemcode());
			pdto.setQty(projectlist.get(i).getSchQuantity());
			pdto.setProjectcode(projectcode);
			pdto.setTotalqty(projetctstockmasterlist.get(i).getTotal());
			pdto.setBalanceqty(Integer.parseInt(projetctstockmasterlist.get(i).getBalanceQuantity()));
			pdto.setSupplyqty(Integer.parseInt(projetctstockmasterlist.get(i).getSupplyQuantity()));
			pdto.setDesciption(projetctstockmasterlist.get(i).getItemdescription());
			projectstockdtolist.add(pdto);
		
	}
	
	
	return projectstockdtolist;
	}
	
	
	@GetMapping("/getProjectEIWorksDataByProjectcode")
	public @ResponseBody List getProjectEIWorksDataByProjectcode(@RequestParam("projectcode") String projectcode) 
	{
		
		return projecteiservice.getProjectEiWorkDetailsByProjectCode(projectcode);

	}
}
