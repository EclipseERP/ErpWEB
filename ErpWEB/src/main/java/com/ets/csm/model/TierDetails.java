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
@Table(name = "tier_details")
public class TierDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="icing_user_id")
	private IcingsUser icingUser;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="cake_id")
	private Cake cake;
	
	//tierShapeID
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="cakepan_user_id")
	private CakePansUser cakepan;
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="cakepan_category_id")
	private CakePanCategories cakePanCat;*/
	
	@Column(name = "tier_order")
	private int tierOrder;
	
	@Column(name = "no_of_layers")
	private int layers;
	
	@Column(name = "serving_count")
	private int servingCount;
	
	@Column(name = "check_serving_count")
	private int checkServingCount;
	
	@Column(name = "special_decoration")
	private String specialDecoration;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IcingsUser getIcingUser() {
		return icingUser;
	}

	public void setIcingUser(IcingsUser icingUser) {
		this.icingUser = icingUser;
	}

	public Cake getCake() {
		return cake;
	}

	public void setCake(Cake cake) {
		this.cake = cake;
	}

	public CakePansUser getCakepan() {
		return cakepan;
	}

	public void setCakepan(CakePansUser cakepan) {
		this.cakepan = cakepan;
	}

	public int getTierOrder() {
		return tierOrder;
	}

	public void setTierOrder(int tierOrder) {
		this.tierOrder = tierOrder;
	}

	public int getLayers() {
		return layers;
	}

	public void setLayers(int layers) {
		this.layers = layers;
	}

	public int getServingCount() {
		return servingCount;
	}

	public void setServingCount(int servingCount) {
		this.servingCount = servingCount;
	}

	public int getCheckServingCount() {
		return checkServingCount;
	}

	public void setCheckServingCount(int checkServingCount) {
		this.checkServingCount = checkServingCount;
	}

	public String getSpecialDecoration() {
		return specialDecoration;
	}

	public void setSpecialDecoration(String specialDecoration) {
		this.specialDecoration = specialDecoration;
	}

	/*public CakePanCategories getCakePanCat() {
		return cakePanCat;
	}

	public void setCakePanCat(CakePanCategories cakePanCat) {
		this.cakePanCat = cakePanCat;
	}*/

	
	

}
