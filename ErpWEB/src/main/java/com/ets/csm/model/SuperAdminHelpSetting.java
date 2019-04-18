package com.ets.csm.model;

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
@Table(name ="superadminhelpsettingmaster")
public class SuperAdminHelpSetting {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="settingtype")
	private String settingtype;
	
	@Column(name="settingname")
	private String settingname;
	
	@Column(name="adminrole")
	private String adminrole;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	@Column(name="settingheader")
	private String settingheader;
	
	@Column(name="settingcontent")
	private String settingcontent;
	
	
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

	public String getSettingtype() {
		return settingtype;
	}

	public void setSettingtype(String settingtype) {
		this.settingtype = settingtype;
	}

	public String getSettingname() {
		return settingname;
	}

	public void setSettingname(String settingname) {
		this.settingname = settingname;
	}

	public String getAdminrole() {
		return adminrole;
	}

	public void setAdminrole(String adminrole) {
		this.adminrole = adminrole;
	}

	
	public String getSettingheader() {
		return settingheader;
	}

	public void setSettingheader(String settingheader) {
		this.settingheader = settingheader;
	}

	public String getSettingcontent() {
		return settingcontent;
	}

	public void setSettingcontent(String settingcontent) {
		this.settingcontent = settingcontent;
	}


	public SuperAdminHelpSetting(int id, String settingtype, String settingname, String adminrole, User user,
			String settingheader, String settingcontent) {
		super();
		this.id = id;
		this.settingtype = settingtype;
		this.settingname = settingname;
		this.adminrole = adminrole;
		this.user = user;
		this.settingheader = settingheader;
		this.settingcontent = settingcontent;
	}

	public SuperAdminHelpSetting() {
		super();
		// TODO Auto-generated constructor stub
	}

}
