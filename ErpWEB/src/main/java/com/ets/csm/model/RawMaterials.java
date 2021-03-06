package com.ets.csm.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.ets.csm.model.User;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "raw_materials")
public class RawMaterials {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	
	@Column(name = "name")
	private String name;

	
	/*@Column(name = "itemCode")
	private String itemCode;*/
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "companyId")
	private int companyId;
	
	@Column(name = "projectId")
	private int projectId;
	
	@Column(name = "vendorId")
	private int vendorId;
	
	@Column(name = "gst")
	private int gst;
	
	@Column(name = "totalAmount")
	private double totalAmount;
	
	@Column(name = "itemType")
	private int itemType;
	
	@Column(name = "itemCode")
	private String itemCode;
	
	@Column(name = "transportationCode")
	private String transportationCode;
	
	@Column(name = "dateOfEntry")
	private Date dateOfEntry;
	
	@Column(name = "description")
	private String description;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "descriptionHSNno")
	private String descriptionHSNno;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	@Column(name = "rate")
	private int rate;
	
	@Column(name = "qty")
	private int qty;
	
	@Column(name = "unit")
	private String unit;
	
	@Column(name = "hsno")
	private String hsno;
	
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
	
	@Column(name = "ins")
	private String ins;
	
	@Column(name = "all_inclusive_rate")
	private String allInclusiveRate;
	
	@Column(name = "ei_work1")
	private String eiWork1;
	
	@Column(name = "ei_work2")
	private String eiWork2;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getItemType() {
		return itemType;
	}

	public void setItemType(int itemType) {
		this.itemType = itemType;
	}

	public String getTransportationCode() {
		return transportationCode;
	}

	public void setTransportationCode(String transportationCode) {
		this.transportationCode = transportationCode;
	}

	public Date getDateOfEntry() {
		return dateOfEntry;
	}

	public void setDateOfEntry(Date dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

	public String getDescriptionHSNno() {
		return descriptionHSNno;
	}

	public void setDescriptionHSNno(String descriptionHSNno) {
		this.descriptionHSNno = descriptionHSNno;
	}



	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getHsno() {
		return hsno;
	}

	public void setHsno(String hsno) {
		this.hsno = hsno;
	}



	public RawMaterials(int id, String name, String itemCode, String city, String state, double amount, int companyId,
			int projectId, int vendorId, int gst, double totalAmount, int itemType, String transportationCode,
			Date dateOfEntry, String descriptionHSNno, User user, int rate, int qty, String unit, String hsno) {
		super();
		this.id = id;
		this.name = name;
		this.itemCode = itemCode;
		this.city = city;
		this.state = state;
		this.amount = amount;
		this.companyId = companyId;
		this.projectId = projectId;
		this.vendorId = vendorId;
		this.gst = gst;
		this.totalAmount = totalAmount;
		this.itemType = itemType;
		this.transportationCode = transportationCode;
		this.dateOfEntry = dateOfEntry;
		this.descriptionHSNno = descriptionHSNno;
		this.user = user;
		this.rate = rate;
		this.qty = qty;
		this.unit = unit;
		this.hsno = hsno;
	}

	public RawMaterials() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
}
