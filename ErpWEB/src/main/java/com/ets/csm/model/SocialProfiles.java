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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="social_profile")
public class SocialProfiles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	@Column(name="social_url")
	private String social_url;
	
	@Column(name="status")
	private int status;
	
	@Column(name="created_at")
	private Date created_at;
	
	@Column(name="update_at")
	private Date update_at;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSocial_url() {
		return social_url;
	}

	public void setSocial_url(String social_url) {
		this.social_url = social_url;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}

	public SocialProfiles(int id, User user, String social_url, int status, Date created_at, Date update_at) {
		super();
		this.id = id;
		this.user = user;
		this.social_url = social_url;
		this.status = status;
		this.created_at = created_at;
		this.update_at = update_at;
	}

	public SocialProfiles() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
