package com.ets.csm.model;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.persistence.JoinColumn;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "vendor")
public class Vendor {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "primary_contact")
	private String primaryContact;
	
	@Column(name = "secondary_contact")
	private String secondaryContact;
	
	@Column(name = "address1")
	private String address1;
	
	@Column(name = "address2")
	private String address2;
	
	@Column(name = "vendor_type")
	private String vendorType;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "zip")
	private Integer zip;
	
	@Column(name = "vendor_code")
	private int vendorCode;
	
	@Column(name = "vendor_docID")
	private int vendorDocID;
	
	@Column(name = "status")
	private int Status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="bank_details_ID")
	private BankDetails bankDetailsID;
	
	@Column(name = "company_PAN")
	private String companyPAN;
	

}
