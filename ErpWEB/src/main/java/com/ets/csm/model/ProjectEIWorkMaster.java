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
@Table(name = "project_ei_work_master")
public class ProjectEIWorkMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

/*	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="project_code")
	private Projects projects;*/
	
	@Column(name = "ei_works")
	private String eiWorks;
	
	@Column(name = "quantity")
	private String quantity;
	
/*	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="id")
	private CompanyDetails companyDetails;*/
	

}
