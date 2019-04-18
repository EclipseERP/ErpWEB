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
@Table(name = "unit_conversion")
public class UnitConversion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	@Column(name = "unit_id")
	private int unit_id;

	@Column(name = "unit")
	private String unit;
	
	@Column(name = "conversion_cup")
	private String conversion_cup;
	
	@Column(name = "conversion_quarts")
	private String conversion_quarts;
	
	@Column(name = "conversion_lb")
	private String conversion_lb;
	
	@Column(name = "conversion_oz")
	private String conversion_oz;
	
	@Column(name = "conversion_ea")
	private String conversion_ea;
	
	@Column(name = "conversion_box")
	private String conversion_box;
	
	@Column(name = "conversion_tsp")
	private String conversion_tsp;
	
	@Column(name = "conversion_tbsp")
	private String conversion_tbsp;
	
	@Column(name = "conversion_gal")
	private String conversion_gal;
	
	@Column(name = "conversion_ml")
	private String conversion_ml;

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

	public int getUnit_id() {
		return unit_id;
	}

	public void setUnit_id(int unit_id) {
		this.unit_id = unit_id;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getConversion_cup() {
		return conversion_cup;
	}

	public void setConversion_cup(String conversion_cup) {
		this.conversion_cup = conversion_cup;
	}

	public String getConversion_quarts() {
		return conversion_quarts;
	}

	public void setConversion_quarts(String conversion_quarts) {
		this.conversion_quarts = conversion_quarts;
	}

	public String getConversion_lb() {
		return conversion_lb;
	}

	public void setConversion_lb(String conversion_lb) {
		this.conversion_lb = conversion_lb;
	}

	public String getConversion_oz() {
		return conversion_oz;
	}

	public void setConversion_oz(String conversion_oz) {
		this.conversion_oz = conversion_oz;
	}

	public String getConversion_ea() {
		return conversion_ea;
	}

	public void setConversion_ea(String conversion_ea) {
		this.conversion_ea = conversion_ea;
	}

	public String getConversion_box() {
		return conversion_box;
	}

	public void setConversion_box(String conversion_box) {
		this.conversion_box = conversion_box;
	}

	public String getConversion_tsp() {
		return conversion_tsp;
	}

	public void setConversion_tsp(String conversion_tsp) {
		this.conversion_tsp = conversion_tsp;
	}

	public String getConversion_tbsp() {
		return conversion_tbsp;
	}

	public void setConversion_tbsp(String conversion_tbsp) {
		this.conversion_tbsp = conversion_tbsp;
	}

	public String getConversion_gal() {
		return conversion_gal;
	}

	public void setConversion_gal(String conversion_gal) {
		this.conversion_gal = conversion_gal;
	}

	public String getConversion_ml() {
		return conversion_ml;
	}

	public void setConversion_ml(String conversion_ml) {
		this.conversion_ml = conversion_ml;
	}

	public UnitConversion(int id, User user, int unit_id, String unit, String conversion_cup, String conversion_quarts,
			String conversion_lb, String conversion_oz, String conversion_ea, String conversion_box,
			String conversion_tsp, String conversion_tbsp, String conversion_gal, String conversion_ml) {
		super();
		this.id = id;
		this.user = user;
		this.unit_id = unit_id;
		this.unit = unit;
		this.conversion_cup = conversion_cup;
		this.conversion_quarts = conversion_quarts;
		this.conversion_lb = conversion_lb;
		this.conversion_oz = conversion_oz;
		this.conversion_ea = conversion_ea;
		this.conversion_box = conversion_box;
		this.conversion_tsp = conversion_tsp;
		this.conversion_tbsp = conversion_tbsp;
		this.conversion_gal = conversion_gal;
		this.conversion_ml = conversion_ml;
	}

	public UnitConversion() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
