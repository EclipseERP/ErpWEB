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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "projectstockrecordmaster")
public class ProjectStockRecordMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
		
	@Column(name = "projectcode")
	private String projectcode;
	@ManyToOne(fetch=FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	private Projects project;
	
	@Column(name="itemcode")
	private String itemCode;
	
	@Column(name="unit")
    private String unit;
	
	@Column(name="ins")
	private String ins;
	
	@Column(name="total")
	private int total;
	

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
	private Date wayBillNoDate;
	
	@Column(name = "bill_no")
	private String billNo;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "arrival_date_at_railway_store")
	private Date arrivalDateAtRailwayStore;

	@Column(name = "date_of_railway_receipt")
	private Date dateOfRailwayReceipt;
	
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
	private Date dateOfSupply;
	
	@Column(name = "supplier_with_address")
	private String supplierWithAddress;
	
	@Column(name = "percentage_above")
	private String percentageAbove;
	
	@Column(name = "all_inclusive_rate")
	private String allInclusiveRate;
	
	@Column(name="rate")
	private int rate;
	
	@Column(name="itemdescription")
	private String description;
	
	@Column(name="dateofArrivalrelayreceipt")
	private Date dateofArrivalrelayreceipt;
	
	@Column(name="status")
	private String status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="vendorid")
	private Vendor vendor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectcode() {
		return projectcode;
	}

	public void setProjectcode(String projectcode) {
		this.projectcode = projectcode;
	}

	public String getItemcode() {
		return itemCode;
	}

	public void setItemcode(String itemcode) {
		this.itemCode = itemcode;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getIns() {
		return ins;
	}

	public void setIns(String ins) {
		this.ins = ins;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
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

	public Date getWayBillNoDate() {
		return wayBillNoDate;
	}

	public void setWayBillNoDate(Date wayBillNoDate) {
		this.wayBillNoDate = wayBillNoDate;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getArrivalDateAtRailwayStore() {
		return arrivalDateAtRailwayStore;
	}

	public void setArrivalDateAtRailwayStore(Date arrivalDateAtRailwayStore) {
		this.arrivalDateAtRailwayStore = arrivalDateAtRailwayStore;
	}

	public Date getDateOfRailwayReceipt() {
		return dateOfRailwayReceipt;
	}

	public void setDateOfRailwayReceipt(Date dateOfRailwayReceipt) {
		this.dateOfRailwayReceipt = dateOfRailwayReceipt;
	}

	public String getTruckNumber() {
		return truckNumber;
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

	public Date getDateOfSupply() {
		return dateOfSupply;
	}

	public void setDateOfSupply(Date dateOfSupply) {
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

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getItemdescription() {
		return description;
	}

	public void setItemdescription(String itemdescription) {
		this.description = itemdescription;
	}

	public Date getDateofArrivalrelayreceipt() {
		return dateofArrivalrelayreceipt;
	}

	public void setDateofArrivalrelayreceipt(Date dateofArrivalrelayreceipt) {
		this.dateofArrivalrelayreceipt = dateofArrivalrelayreceipt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}


	
}
