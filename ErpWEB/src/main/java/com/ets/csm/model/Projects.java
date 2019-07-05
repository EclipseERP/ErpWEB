package com.ets.csm.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.OrderBy;
import org.hibernate.annotations.Where;

import com.ets.csm.model.User;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "project_master")

public class Projects implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "project_id")
	private Long id;
	@ManyToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	@Basic(fetch = FetchType.LAZY)
	@JoinTable(name="project_master_transport",
				joinColumns={@JoinColumn(referencedColumnName="project_id")},
				inverseJoinColumns={@JoinColumn(referencedColumnName="transport_id")})
	@Fetch(FetchMode.JOIN)
	private List<Transport> transports;
	@OneToMany(fetch=FetchType.EAGER,mappedBy="project",cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	@Fetch(FetchMode.SELECT)
	private List<ProjectStockRecordMaster> projectStockRecords;

	@Column(name = "project_code")
	private String project_code;
	
	@Column(name = "loa_no")
	private String loano;
	
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
		return loano;
	}

	public void setLOAnumber(String loa_no) {
		this.loano = loa_no;
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
		return loano;
	}

	public void setLoa_no(String loa_no) {
		this.loano = loa_no;
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
	public List<Transport> getTransports() {
		if(transports==null) {
			return new ArrayList<Transport>();
		}
		return transports;
	}

	public void setTransports(List<Transport> transports) {
		if(transports==null|| transports.isEmpty()) {
			this.transports=new ArrayList<Transport>();
		}
		this.transports = transports;
	}

	public String getLoano() {
		return loano;
	}

	public void setLoano(String loano) {
		this.loano = loano;
	}

	public List<ProjectStockRecordMaster> getProjectStockRecords() {
		return projectStockRecords;
	}

	public void setProjectStockRecords(List<ProjectStockRecordMaster> projectStockRecords) {
		this.projectStockRecords = projectStockRecords;
	}

	public Projects(Long id, String project_code, String loa_no, Date creation_date, Date update_date, int company_id,
				User user, String itemcodes, String ins, String location, String eiwork, String projectname,
				String projectdetails) {
			super();
			this.id = id;
			this.project_code = project_code;
			this.loano = loa_no;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allInclusiveRate == null) ? 0 : allInclusiveRate.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((arrivalDateAtRailwayStore == null) ? 0 : arrivalDateAtRailwayStore.hashCode());
		result = prime * result + ((balanceQuantity == null) ? 0 : balanceQuantity.hashCode());
		result = prime * result + ((billNo == null) ? 0 : billNo.hashCode());
		result = prime * result + ((billQuantity == null) ? 0 : billQuantity.hashCode());
		result = prime * result + company_id;
		result = prime * result + ((creation_date == null) ? 0 : creation_date.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((dateOfRailwayReceipt == null) ? 0 : dateOfRailwayReceipt.hashCode());
		result = prime * result + ((dateOfSupply == null) ? 0 : dateOfSupply.hashCode());
		result = prime * result + ((eiwork == null) ? 0 : eiwork.hashCode());
		result = prime * result + ((icDetails == null) ? 0 : icDetails.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ins == null) ? 0 : ins.hashCode());
		result = prime * result + ((itemcodes == null) ? 0 : itemcodes.hashCode());
		result = prime * result + ((loano == null) ? 0 : loano.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((payments == null) ? 0 : payments.hashCode());
		result = prime * result + ((percentageAbove == null) ? 0 : percentageAbove.hashCode());
		result = prime * result + ((placeOfDelivery == null) ? 0 : placeOfDelivery.hashCode());
		result = prime * result + ((project_code == null) ? 0 : project_code.hashCode());
		result = prime * result + ((projectdetails == null) ? 0 : projectdetails.hashCode());
		result = prime * result + ((projectname == null) ? 0 : projectname.hashCode());
		result = prime * result + schUnitRate;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((supplierWithAddress == null) ? 0 : supplierWithAddress.hashCode());
		result = prime * result + ((supplyQuantity == null) ? 0 : supplyQuantity.hashCode());
		result = prime * result + totalqty;
		result = prime * result + ((transporter == null) ? 0 : transporter.hashCode());
		result = prime * result + ((transports == null) ? 0 : transports.hashCode());
		result = prime * result + ((truckNumber == null) ? 0 : truckNumber.hashCode());
		result = prime * result + ((units == null) ? 0 : units.hashCode());
		result = prime * result + ((update_date == null) ? 0 : update_date.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((wayBillNoDate == null) ? 0 : wayBillNoDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projects other = (Projects) obj;
		if (allInclusiveRate == null) {
			if (other.allInclusiveRate != null)
				return false;
		} else if (!allInclusiveRate.equals(other.allInclusiveRate))
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (arrivalDateAtRailwayStore == null) {
			if (other.arrivalDateAtRailwayStore != null)
				return false;
		} else if (!arrivalDateAtRailwayStore.equals(other.arrivalDateAtRailwayStore))
			return false;
		if (balanceQuantity == null) {
			if (other.balanceQuantity != null)
				return false;
		} else if (!balanceQuantity.equals(other.balanceQuantity))
			return false;
		if (billNo == null) {
			if (other.billNo != null)
				return false;
		} else if (!billNo.equals(other.billNo))
			return false;
		if (billQuantity == null) {
			if (other.billQuantity != null)
				return false;
		} else if (!billQuantity.equals(other.billQuantity))
			return false;
		if (company_id != other.company_id)
			return false;
		if (creation_date == null) {
			if (other.creation_date != null)
				return false;
		} else if (!creation_date.equals(other.creation_date))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (dateOfRailwayReceipt == null) {
			if (other.dateOfRailwayReceipt != null)
				return false;
		} else if (!dateOfRailwayReceipt.equals(other.dateOfRailwayReceipt))
			return false;
		if (dateOfSupply == null) {
			if (other.dateOfSupply != null)
				return false;
		} else if (!dateOfSupply.equals(other.dateOfSupply))
			return false;
		if (eiwork == null) {
			if (other.eiwork != null)
				return false;
		} else if (!eiwork.equals(other.eiwork))
			return false;
		if (icDetails == null) {
			if (other.icDetails != null)
				return false;
		} else if (!icDetails.equals(other.icDetails))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ins == null) {
			if (other.ins != null)
				return false;
		} else if (!ins.equals(other.ins))
			return false;
		if (itemcodes == null) {
			if (other.itemcodes != null)
				return false;
		} else if (!itemcodes.equals(other.itemcodes))
			return false;
		if (loano == null) {
			if (other.loano != null)
				return false;
		} else if (!loano.equals(other.loano))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (payments == null) {
			if (other.payments != null)
				return false;
		} else if (!payments.equals(other.payments))
			return false;
		if (percentageAbove == null) {
			if (other.percentageAbove != null)
				return false;
		} else if (!percentageAbove.equals(other.percentageAbove))
			return false;
		if (placeOfDelivery == null) {
			if (other.placeOfDelivery != null)
				return false;
		} else if (!placeOfDelivery.equals(other.placeOfDelivery))
			return false;
		if (project_code == null) {
			if (other.project_code != null)
				return false;
		} else if (!project_code.equals(other.project_code))
			return false;
		if (projectdetails == null) {
			if (other.projectdetails != null)
				return false;
		} else if (!projectdetails.equals(other.projectdetails))
			return false;
		if (projectname == null) {
			if (other.projectname != null)
				return false;
		} else if (!projectname.equals(other.projectname))
			return false;
		if (schUnitRate != other.schUnitRate)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (supplierWithAddress == null) {
			if (other.supplierWithAddress != null)
				return false;
		} else if (!supplierWithAddress.equals(other.supplierWithAddress))
			return false;
		if (supplyQuantity == null) {
			if (other.supplyQuantity != null)
				return false;
		} else if (!supplyQuantity.equals(other.supplyQuantity))
			return false;
		if (totalqty != other.totalqty)
			return false;
		if (transporter == null) {
			if (other.transporter != null)
				return false;
		} else if (!transporter.equals(other.transporter))
			return false;
		if (transports == null) {
			if (other.transports != null)
				return false;
		} else if (!transports.equals(other.transports))
			return false;
		if (truckNumber == null) {
			if (other.truckNumber != null)
				return false;
		} else if (!truckNumber.equals(other.truckNumber))
			return false;
		if (units == null) {
			if (other.units != null)
				return false;
		} else if (!units.equals(other.units))
			return false;
		if (update_date == null) {
			if (other.update_date != null)
				return false;
		} else if (!update_date.equals(other.update_date))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (wayBillNoDate == null) {
			if (other.wayBillNoDate != null)
				return false;
		} else if (!wayBillNoDate.equals(other.wayBillNoDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Projects [id=" + id + ", transports=" + transports + ", project_code=" + project_code + ", loano="
				+ loano + ", creation_date=" + creation_date + ", update_date=" + update_date + ", company_id="
				+ company_id + ", schUnitRate=" + schUnitRate + ", amount=" + amount + ", billQuantity=" + billQuantity
				+ ", wayBillNoDate=" + wayBillNoDate + ", billNo=" + billNo + ", date=" + date
				+ ", arrivalDateAtRailwayStore=" + arrivalDateAtRailwayStore + ", dateOfRailwayReceipt="
				+ dateOfRailwayReceipt + ", truckNumber=" + truckNumber + ", transporter=" + transporter
				+ ", placeOfDelivery=" + placeOfDelivery + ", supplyQuantity=" + supplyQuantity + ", balanceQuantity="
				+ balanceQuantity + ", icDetails=" + icDetails + ", dateOfSupply=" + dateOfSupply
				+ ", supplierWithAddress=" + supplierWithAddress + ", percentageAbove=" + percentageAbove
				+ ", allInclusiveRate=" + allInclusiveRate + ", user=" + user + ", itemcodes=" + itemcodes + ", ins="
				+ ins + ", location=" + location + ", eiwork=" + eiwork + ", payments=" + payments + ", projectname="
				+ projectname + ", projectdetails=" + projectdetails + ", totalqty=" + totalqty + ", units=" + units
				+ ", state=" + state + "]";
	}	
}
