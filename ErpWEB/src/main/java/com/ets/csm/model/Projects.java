package com.ets.csm.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.ets.csm.model.User;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "project_master")

public class Projects {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "project_code")
	private String project_code;
	
	@Column(name = "loa_no")
	private String loa_no;
	
	@Column(name = "creation_date")
	private Date creation_date;
	
	@Column(name = "update_date")
	private Date update_date;
	
	@Column(name = "company_id")
	private int company_id;
	
	@Column(name = "sch_unit_rate")
	private int schUnitRate;

	@Column(name = "amount")
	private String amount;
	
	@Column(name = "bill_quantity")
	private String billQuantity;
	
	@Column(name = "way_bill_no_date")
	private String wayBillNoDate;
	
	@Column(name = "bill_no")
	private String billNo;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "arrival_date_at_railway_store")
	private String arrivalDateAtRailwayStore;

	@Column(name = "date_of_railway_receipt")
	private String dateOfRailwayReceipt;
	
	@Column(name = "truck_number")
	private String truckNumber;
	
	@Column(name = "transporter")
	private String transporter;
	
	@Column(name = "place_of_delivery")
	private String placeOfDelivery;
	
	@Column(name = "supply_quantity")
	private String supplyQuantity;
	
	@Column(name = "balance_quantity")
	private String balanceQuantity;
	
	@Column(name = "ic_details")
	private String icDetails;
	
	@Column(name = "date_of_supply")
	private String dateOfSupply;
	
	@Column(name = "supplier_with_address")
	private String supplierWithAddress;
	
	@Column(name = "percentage_above")
	private String percentageAbove;
	
	@Column(name = "all_inclusive_rate")
	private String allInclusiveRate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="user_id")
	private User user;
	
	
    @Column(name="itemid")
    private String itemcodes;
    
    @Column(name="ins")
    private String ins;
    
    @Column(name="location")
    private String location;
    
    @Column(name="eiwork")
    private String eiwork;
    @OneToMany(mappedBy="project")
    @JsonIgnore
    private List<Payment> payments;
    @Column(name="projectname")
    private String projectname;
    
    @Column(name="projectdetails")
    private String projectdetails;
    
    @Column(name="totalqty")
    private int totalqty;
   
    @Column(name="units")
    private String units;
    
    @Column(name="state")
    private String state;
    
    
     
    
	public String getProjectCode() {
		return project_code;
	}

	public void setProjectCode(String project_code) {
		this.project_code = project_code;
	}
	
	public String getLOAnumber() {
		return loa_no;
	}

	public void setLOAnumber(String loa_no) {
		this.loa_no = loa_no;
	}
	
	public Date getCreationDate() {
		return creation_date;
	}

	public void setCreationDate(Date creation_date) {
		this.creation_date = creation_date;
	}
	
	public Date getUpdateDate() {
		return update_date;
	}

	public void setUpdateDate(Date update_date) {
		this.update_date = update_date;
	}

	public int getCompanyID() {
		return company_id;
	}

	public void setCompanyID(int company_id) {
		this.company_id = company_id;
	}
	

	public int getSchUnitRate() {
		return schUnitRate;
	}

	public void setSchUnitRate(int schUnitRate) {
		this.schUnitRate = schUnitRate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBillQuantity() {
		return billQuantity;
	}

	public void setBillQuantity(String billQuantity) {
		this.billQuantity = billQuantity;
	}

	public String getWayBillNoDate() {
		return wayBillNoDate;
	}

	public void setWayBillNoDate(String wayBillNoDate) {
		this.wayBillNoDate = wayBillNoDate;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getArrivalDateAtRailwayStore() {
		return arrivalDateAtRailwayStore;
	}

	public void setArrivalDateAtRailwayStore(String arrivalDateAtRailwayStore) {
		this.arrivalDateAtRailwayStore = arrivalDateAtRailwayStore;
	}

	public String getDateOfRailwayReceipt() {
		return dateOfRailwayReceipt;
	}

	public void setDateOfRailwayReceipt(String dateOfRailwayReceipt) {
		this.dateOfRailwayReceipt = dateOfRailwayReceipt;
	}

	public String getTruckNumber() {
		return truckNumber;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}

	public String getTransporter() {
		return transporter;
	}

	public void setTransporter(String transporter) {
		this.transporter = transporter;
	}

	public String getPlaceOfDelivery() {
		return placeOfDelivery;
	}

	public void setPlaceOfDelivery(String placeOfDelivery) {
		this.placeOfDelivery = placeOfDelivery;
	}

	public String getSupplyQuantity() {
		return supplyQuantity;
	}

	public void setSupplyQuantity(String supplyQuantity) {
		this.supplyQuantity = supplyQuantity;
	}

	public String getBalanceQuantity() {
		return balanceQuantity;
	}

	public void setBalanceQuantity(String balanceQuantity) {
		this.balanceQuantity = balanceQuantity;
	}

	public String getIcDetails() {
		return icDetails;
	}

	public void setIcDetails(String icDetails) {
		this.icDetails = icDetails;
	}

	public String getDateOfSupply() {
		return dateOfSupply;
	}

	public void setDateOfSupply(String dateOfSupply) {
		this.dateOfSupply = dateOfSupply;
	}

	public String getSupplierWithAddress() {
		return supplierWithAddress;
	}

	public void setSupplierWithAddress(String supplierWithAddress) {
		this.supplierWithAddress = supplierWithAddress;
	}

	public String getPercentageAbove() {
		return percentageAbove;
	}

	public void setPercentageAbove(String percentageAbove) {
		this.percentageAbove = percentageAbove;
	}

	public String getAllInclusiveRate() {
		return allInclusiveRate;
	}

	public void setAllInclusiveRate(String allInclusiveRate) {
		this.allInclusiveRate = allInclusiveRate;
	}

	public int getTotalqty() {
		return totalqty;
	}

	public void setTotalqty(int totalqty) {
		this.totalqty = totalqty;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProject_code() {
		return project_code;
	}

	public void setProject_code(String project_code) {
		this.project_code = project_code;
	}

	public String getLoa_no() {
		return loa_no;
	}

	public void setLoa_no(String loa_no) {
		this.loa_no = loa_no;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	public String getItemcodes() {
		return itemcodes;
	}

	public void setItemcodes(String itemcodes) {
		this.itemcodes = itemcodes;
	}

	public String getIns() {
		return ins;
	}

	public void setIns(String ins) {
		this.ins = ins;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEiwork() {
		return eiwork;
	}

	public void setEiwork(String eiwork) {
		this.eiwork = eiwork;
	}

	
	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

public String getProjectdetails() {
		return projectdetails;
	}

	public void setProjectdetails(String projectdetails) {
		this.projectdetails = projectdetails;
	}

public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}





public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

public Projects(Long id, String project_code, String loa_no, Date creation_date, Date update_date, int company_id,
			User user, String itemcodes, String ins, String location, String eiwork, String projectname,
			String projectdetails) {
		super();
		this.id = id;
		this.project_code = project_code;
		this.loa_no = loa_no;
		this.creation_date = creation_date;
		this.update_date = update_date;
		this.company_id = company_id;
		this.user = user;
		this.itemcodes = itemcodes;
		this.ins = ins;
		this.location = location;
		this.eiwork = eiwork;
		this.projectname = projectname;
		this.projectdetails = projectdetails;
	}

public Projects(){
	super();
	// TODO Auto-generated constructor stub
}
}
