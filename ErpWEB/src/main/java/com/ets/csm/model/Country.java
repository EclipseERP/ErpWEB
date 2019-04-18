package com.ets.csm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="iso")
	private String iso;
	
	@Column(name="name")
	private String name;
	
	@Column(name="nicename")
	private String nicename;
	
	@Column(name="iso3")
	private String iso3;
	
	@Column(name="numcode")
	private String numcode;
	
	@Column(name="phonecode")
	private String phonecoe;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNicename() {
		return nicename;
	}

	public void setNicename(String nicename) {
		this.nicename = nicename;
	}

	public String getIso3() {
		return iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public String getNumcode() {
		return numcode;
	}

	public void setNumcode(String numcode) {
		this.numcode = numcode;
	}

	public String getPhonecoe() {
		return phonecoe;
	}

	public void setPhonecoe(String phonecoe) {
		this.phonecoe = phonecoe;
	}

	public Country(int id, String iso, String name, String nicename, String iso3, String numcode, String phonecoe) {
		super();
		this.id = id;
		this.iso = iso;
		this.name = name;
		this.nicename = nicename;
		this.iso3 = iso3;
		this.numcode = numcode;
		this.phonecoe = phonecoe;
	}

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
