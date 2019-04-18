package com.ets.csm.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "localization")

public class Localization {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "time_format")
	private String timeFormat;
	
	@Column(name = "time_header")
	private String timeHeader;
	
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTimeFormat() {
		return timeFormat;
	}

	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}

	public String getTimeHeader() {
		return timeHeader;
	}

	public void setTimeHeader(String timeHeader) {
		this.timeHeader = timeHeader;
	}

	

	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}	
	
/*	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String gettimeFormat() {
		return timeFormat;
	}

	public void settimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}

	public String gettimeHeader() {
		return timeHeader;
	}

	public void settimeHeader(String timeHeader) {
		this.timeHeader = timeHeader;
	}

	public String getadminUserId() {
		return adminUserId;
	}

	public void setadminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}
	
	
	public String getcreatedDate() {
		return adminUserId;
	}

	public void setcreatedDate(String createdDate) {
		this.createdDate = createdDate;*/
	
	

