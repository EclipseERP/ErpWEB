package com.ets.csm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projectstockrecordmaster")
public class ProjectStockRecordMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
		
	@Column(name = "projectcode")
	private String projectcode;
	
	@Column(name="itemcode")
	private String itemcode;
	
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
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectcode() {
		return projectcode;
	}

	public void setProjectcode(String projectcode) {
		this.projectcode = projectcode;
	}

	public String getItemcode() {
		return itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
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
	
	

}
