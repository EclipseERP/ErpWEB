package com.ets.csm.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.websocket.Decoder.Binary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ets.csm.dto.ProjectItemCodeListDTO;
import com.ets.csm.model.Document;
import com.ets.csm.model.ProjectEIWorkMaster;
import com.ets.csm.model.ProjectLocationMaster;
import com.ets.csm.model.ProjectStockRecordMaster;
import com.ets.csm.model.Projects;
import com.ets.csm.model.RawMaterials;
import com.ets.csm.model.Transport;
import com.ets.csm.model.User;
import com.ets.csm.service.DocumentService;
import com.ets.csm.service.ProjectEIWorkMasterService;
import com.ets.csm.service.ProjectLocationMasterService;
import com.ets.csm.service.ProjectStockMasterService;
import com.ets.csm.service.ProjectsService;
import com.ets.csm.service.RawMaterialsService;
import com.ets.csm.service.UserService;
import com.ets.csm.util.DateUtility;

@Controller
@RequestMapping("/project")

public class ProjectMasterController {
	@Autowired
	UserService userService;
	
	@Autowired
	DocumentService documentService;

	@Autowired
	ProjectsService projectservice;

	@Autowired
	ProjectLocationMasterService projectlocationservice;

	@Autowired
	ProjectEIWorkMasterService projecteiservice;

	@Autowired
	ProjectStockMasterService projectstockmasterservice;
	
	@Autowired
	RawMaterialsService rawmaterialservice;
	

	@GetMapping("/getProjects")
	public @ResponseBody List getProjectList() {
		return projectservice.getAllProjects();
	}

	@GetMapping("/getProjectsByID")
	public @ResponseBody List getProjectListByID(int id) {
		return projectservice.getAllProjectsByID(id);
	}
	
	@GetMapping("/projectLocationsPage")
	public String getProjectLocationsPage() {
		return "/module/user/loalist";
	}
	
	@GetMapping("items/itemsPage")
	public String getItemsPage() {
		return "/module/user/itemsList";
	}
	
	@GetMapping("/document")
	public String getDocumentPage() {
		return "/module/user/addDocument";
	}
	
	@PostMapping(value="/documents",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	@ResponseBody
	public void saveDocument(@RequestParam MultipartFile document,@RequestParam String documentName) {
		 try {
			documentService.save(document,documentName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	@PostMapping(value="/documents")
//	@ResponseBody
//	public void saveDocument(@RequestBody Document document) {
//		 	documentService.save(document);
//		
//	}
	
	
	@GetMapping("/{state}/{itemType}")
	public @ResponseBody List<Projects> getProjectListByState(@PathVariable String state,@PathVariable int itemType) {
		if(itemType==1&&!"none".equals(state)) {
			return projectservice.getProjectByLoa(state);
		}
		if(itemType==2&&!"none".equals(state)) {
			return projectservice.getProjectByState(state);
		}
		if(itemType==3 && !"none".equals(state)) {
			return projectservice.getProjectByYear(state);
		}
		if(itemType==0 && !"none".equals(state)) {
			return projectservice.getProjectByLoaSateAndYear(state);
		}
		if("none".equals(state)) {
			return projectservice.getAllProjects();
		}
		
		
		return null;
	}
	
	@GetMapping("/projectListPageload")
	public String projectlistShow() {
		return "/module/user/projectList";
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

	@PostMapping(value="/saveProject/{userName}")
	@ResponseBody
	public  void saveProject(@PathVariable String userName,
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
			@RequestParam("loa_details") String loadetails, @RequestParam("projectdetails") String projectdetails,
			@RequestParam("tendardate") String tenderdate,
	        @RequestParam("itemcodeflagslist") String[] itemcodeflagslist,@RequestParam("state") String state,
	        @RequestBody Projects projects)
	{

		try {
			System.out.println(projects.getProjectStockRecords());
			 projectservice.merge(projects);
			
			for (int i = 0; i < projectLocationlist.length; i++) {

				Projects pdata = new Projects();
				pdata.setProject_code(projectcode);
				pdata.setLoa_no(loadetails);
				pdata.setProjectdetails(projectdetails);
				pdata.setProjectname(projectLocationlist[i]);
				pdata.setDate(tenderdate);
				pdata.setTotalqty(totallist[0]);
				pdata.setState(state);
				

				//projectservice.saveOrUpdate(pdata);
			}

			for (int k = 0; k < itemcodeslist.length; k++) {

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
				pdatas.setBalanceQuantity(totallist[k] + "");
				pdatas.setPlaceOfDelivery("");
				pdatas.setTruckNumber("");
				pdatas.setTransporter("");
				pdatas.setBillNo("");
				pdatas.setBillQuantity(totallist[k] + "");
				pdatas.setItemdescription(rawmaterialservice.getAllRawMaterialsByItemcode(itemcodeslist[k]).getDescription());
				pdatas.setSchUnitRate(0);
				pdatas.setAmount("0");
				pdatas.setPercentageAbove("0");
				pdatas.setAllInclusiveRate("0");
				pdatas.setRate(0);
				pdatas.setIcDetails("");
				pdatas.setBillNo("");
				pdatas.setStatus("Pending");
				
				
				//projectstockmasterservice.saveorUpdate(pdatas);


			}

			for (int j = 0; j < projectLocationlist.length; j++) {

				for (int l = 0; l < projectLocationlistSCHQTY.length; l++) {
					ProjectLocationMaster plocation = new ProjectLocationMaster();

					if (locflaglist[l].equalsIgnoreCase(projectLocationlist[j])) {
						plocation.setProjectcode(projectcode);
						plocation.setProjectLocation(projectLocationlist[j]);
						plocation.setSchQuantity(projectLocationlistSCHQTY[l]);
						plocation.setState(state);
						projectlocationservice.saveOrUpdate(plocation);
					}

				}
			}
			
			for (int n = 0; n < addEiworklist.length; n++) {

				for (int m = 0; m < addEiworklistQTY.length; m++) {
					ProjectEIWorkMaster eiworks = new ProjectEIWorkMaster();
					if (eiflaglist[m].equalsIgnoreCase(addEiworklist[n])) {
						eiworks.setProject_code(projectcode);
						eiworks.setEiWorks(addEiworklist[n]);
						eiworks.setQuantity(addEiworklistQTY[m]);
						eiworks.setItemcode(itemcodeflagslist[m]);
						
						projecteiservice.saveOrUpdate(eiworks);
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
	public @ResponseBody Object getProjectCode() {
		Object code = projectservice.findProjectsLastId();
		return code;

	}
	@GetMapping("/projectLocation/{projectLocation}/{projectCode}")
	@ResponseBody
	public List<ProjectLocationMaster> getAllProjectLocationDeatils(@PathVariable String projectCode,@PathVariable String projectLocation){
		List<ProjectLocationMaster> projectlist = projectlocationservice.getAllProjectLocationMaster(projectLocation,projectCode);
		return projectlist;
		
	}
	@PostMapping("/getProjectItemDetailsByProjectcode")
	public @ResponseBody List getProjectItemDetailsByProjectcode(@RequestParam("projectcode") String projectcode,
			@RequestParam("projectlocation") String projectlocation) {

		System.out.println(" " + projectcode);

		List projectstockdtolist = new ArrayList();

		List<ProjectStockRecordMaster> projetctstockmasterlist = projectstockmasterservice.getProjectStockDetailsByProjectcode(projectcode);
		List<ProjectLocationMaster> projectlist = projectlocationservice.getAllProjectLocationMaster(projectlocation,projectcode);

		for (int i = 0; i < projetctstockmasterlist.size(); i++) {
			ProjectItemCodeListDTO pdto = new ProjectItemCodeListDTO();

			pdto.setItemcode(projetctstockmasterlist.get(i).getItemcode());
			pdto.setQty(projectlist.get(i).getSchQuantity());
			pdto.setProjectcode(projectcode);
			pdto.setTotalqty(projetctstockmasterlist.get(i).getTotal());
			pdto.setBalanceqty(Integer.parseInt(projetctstockmasterlist.get(i).getBalanceQuantity()));
			pdto.setSupplyqty(Integer.parseInt(projetctstockmasterlist.get(i).getSupplyQuantity()));
			pdto.setDesciption(projetctstockmasterlist.get(i).getItemdescription());
			pdto.setItemname(rawmaterialservice.getAllRawMaterialsByItemcode(projetctstockmasterlist.get(i).getItemcode()).getName());
			pdto.setUnit(rawmaterialservice.getAllRawMaterialsByItemcode(projetctstockmasterlist.get(i).getItemcode()).getUnit());
			List<ProjectEIWorkMaster> eilist=projecteiservice.getProjectEiWorkDetailsByProjectCode(projectcode,projetctstockmasterlist.get(i).getItemcode());
			int eiqty=0;
			
			for(ProjectEIWorkMaster pe:eilist)
			{
				eiqty=eiqty+Integer.parseInt(pe.getQuantity());
			}
			
			pdto.setEiQuantity(eiqty+"");
			pdto.setSchUnitRate(projetctstockmasterlist.get(i).getSchUnitRate());
			pdto.setAmount(projetctstockmasterlist.get(i).getAmount());
			pdto.setPercentageAbove(projetctstockmasterlist.get(i).getPercentageAbove());
			pdto.setAllInclusiveRate(projetctstockmasterlist.get(i).getAllInclusiveRate());
			pdto.setRate(projetctstockmasterlist.get(i).getRate()+"");
			pdto.setDetailsofic(projetctstockmasterlist.get(i).getIcDetails());
			pdto.setDateofarrivalrlyreceipt(projetctstockmasterlist.get(i).getDateofArrivalrelayreceipt());
			pdto.setDateofrlyreceipt(projetctstockmasterlist.get(i).getDateOfRailwayReceipt());
			pdto.setDateofsupply(projetctstockmasterlist.get(i).getDateOfSupply());
			pdto.setWaybillnodate(projetctstockmasterlist.get(i).getWayBillNoDate());
			pdto.setBillno(projetctstockmasterlist.get(i).getBillNo());
			pdto.setBillqty(projetctstockmasterlist.get(i).getBillQuantity());
			pdto.setStatus(projetctstockmasterlist.get(i).getStatus());
			pdto.setPlaceofdelivery(projetctstockmasterlist.get(i).getPlaceOfDelivery());
			projectstockdtolist.add(pdto);

		}

		return projectstockdtolist;
	}

	@GetMapping("/getProjectEIWorksDataByProjectcode")
	public @ResponseBody List getProjectEIWorksDataByProjectcode(@RequestParam("projectcode") String projectcode,@RequestParam("itemcode") String itemcode) {

		return projecteiservice.getProjectEiWorkDetailsByProjectCode(projectcode,itemcode);
	}
	
	
	@GetMapping("/getProjectDetailsGroupByProjectCode")
	public @ResponseBody List getProjectDetailsGroupByProjectCode() {

		return projectservice.getProjectGroupByProjectCode();

	}
	
	
	@GetMapping("/getProjectDetailsbyProjectCode")
	public @ResponseBody List getProjectDetailsbyProjectCode(@RequestParam("projectcode") String projectcode) {

		return projectservice.getProjectByProjectcode(projectcode);

	}
	
	@PostMapping("/updateSupplyData")
	public @ResponseBody void updateSupplydata(@RequestBody ProjectItemCodeListDTO itemdata)
	{
		
		System.out.println("Item data found "+itemdata);
		
		ProjectStockRecordMaster pdatas=projectstockmasterservice.getProjectStockDataByItemdandProjectCode(itemdata.getProjectcode(), itemdata.getItemcode());
		
		int totasupplyqty=0;
		int oldsupplyqty=Integer.parseInt(pdatas.getSupplyQuantity());
		
		pdatas.setItemcode(itemdata.getItemcode());
		pdatas.setUnit(itemdata.getUnit());
		pdatas.setTotal(itemdata.getTotalqty());
		pdatas.setSchUnitRate(itemdata.getSchUnitRate());
		pdatas.setAmount(itemdata.getAmount());
		pdatas.setPercentageAbove(itemdata.getPercentageAbove());
		pdatas.setAllInclusiveRate(itemdata.getAllInclusiveRate());
		pdatas.setRate(Integer.parseInt(itemdata.getRate()));
		pdatas.setIcDetails(itemdata.getDetailsofic());
		pdatas.setBalanceQuantity(itemdata.getBalanceqty()+"");
		pdatas.setTruckNumber(itemdata.getTrukno());
		pdatas.setBillNo(itemdata.getBillno());
		pdatas.setBillQuantity(itemdata.getBillqty());
		pdatas.setPercentageAbove(itemdata.getPercentageAbove());
		pdatas.setAllInclusiveRate(itemdata.getAllInclusiveRate());
        pdatas.setUpdate_date(DateUtility.getCurrentDateWithTime());
        pdatas.setWayBillNoDate(itemdata.getWaybillnodate());
        pdatas.setDateOfSupply(itemdata.getDateofsupply());
        pdatas.setDateofArrivalrelayreceipt(itemdata.getDateofarrivalrlyreceipt());
        pdatas.setDateOfRailwayReceipt(itemdata.getDateofrlyreceipt());
		pdatas.setPlaceOfDelivery(itemdata.getPlaceofdelivery());
		pdatas.setTransporter(itemdata.getTransporter());
        
        //+++++++++ Supply calculation++++++++++++++++++++++++++        

        double total=0;
        
        if(itemdata.getSupplyqty()!=0 && itemdata.getSupplyqty()<=itemdata.getBalanceqty() && itemdata.getSupplyqty()>=0  )
        {
        	total=itemdata.getBalanceqty()-itemdata.getSupplyqty();
        	totasupplyqty=oldsupplyqty+itemdata.getSupplyqty();
        	pdatas.setSupplyQuantity(totasupplyqty+"");
        	
        	if(totasupplyqty==itemdata.getTotalqty())
        	{
        	
        	pdatas.setStatus("Paid");
        	
        	}
        	
        	pdatas.setBalanceQuantity(Math.round(total)+"");
        	
        }
        projectstockmasterservice.saveorUpdate(pdatas);	
   
	}
	
}
