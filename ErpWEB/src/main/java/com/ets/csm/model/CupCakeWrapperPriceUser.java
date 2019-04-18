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

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cp_cake_wrapper_user")
public class CupCakeWrapperPriceUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "cupCakeId")
	private CpCakePricingUser cupCake;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="wrapper_user_id")
	private WrapperUser wrapperUser;
	
	@Column(name = "price_per_dozen")
	private float pricePerDozen;
	
	@CreationTimestamp
	@Column(name = "created_Date")
	private Date createDate;
	
	@UpdateTimestamp
	@Column(name = "updated_Date")
	private Date updatedDate;

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

	public CpCakePricingUser getCupCake() {
		return cupCake;
	}

	public void setCupCake(CpCakePricingUser cupCake) {
		this.cupCake = cupCake;
	}

	public WrapperUser getWrapperUser() {
		return wrapperUser;
	}

	public void setWrapperUser(WrapperUser wrapperUser) {
		this.wrapperUser = wrapperUser;
	}

	public float getPricePerDozen() {
		return pricePerDozen;
	}

	public void setPricePerDozen(float pricePerDozen) {
		this.pricePerDozen = pricePerDozen;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	

}
