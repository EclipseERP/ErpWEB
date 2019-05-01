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

@Entity
@Table(name = "project_master")

public class Projects {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="user_id")
	private User user;
	
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
	
	public Projects (int id,String project_code,String loa_no,Date creation_date, Date update_date, int company_id,User user) {
		super();
		this.id=id;
		this.project_code=project_code;
		this.loa_no=loa_no;
		this.creation_date=creation_date;
		this.update_date=update_date;
		this.company_id = company_id;
		this.user=user;
		
	}
	
public Projects(){
	super();
	// TODO Auto-generated constructor stub
}
}
