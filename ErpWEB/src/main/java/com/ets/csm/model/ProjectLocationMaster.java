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
@Table(name = "project_location_master")
public class ProjectLocationMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

/*	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="project_code")
	private Projects projects;*/
	
	@Column(name = "project_location")
	private String projectLocation;
	
	@Column(name = "sch_quantity")
	private String schQuantity;
	
/*	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="id")
	private CompanyDetails companyDetails;*/
	

}
