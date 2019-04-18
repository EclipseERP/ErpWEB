package com.ets.csm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="theme")
public class Theme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "colorcodes")
	private String colorcodes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getColorcodes() {
		return colorcodes;
	}

	public void setColorcodes(String colorcodes) {
		this.colorcodes = colorcodes;
	}

	

	public Theme(int id, String name, String status, String colorcodes) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.colorcodes = colorcodes;
	}

	public Theme() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
