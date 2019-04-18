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
@Table(name = "tier_shape")
public class TierShape {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	@Column(name = "tier_size")
	private String tierSize;
	
	@Column(name = "serving_count")
	private float servingCount;
	
	@Column(name = "party_cake_serving_count")
	private float partyCakeServing;
	
	@Column(name = "cups_of_batter")
	private float cupsOfBatter;
	
	@Column(name = "cups_of_icing")
	private float cupsOfIcing;
	
	@Column(name = "cups_of_Filling")
	private float cupsOfFilling;
	
	@Column(name = "pounds_of_Fondant")
	private float poundsOfFondant;
	
	@Column(name = "status")
	private int status;
	
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

	public String getTierSize() {
		return tierSize;
	}

	public void setTierSize(String tierSize) {
		this.tierSize = tierSize;
	}

	public float getServingCount() {
		return servingCount;
	}

	public void setServingCount(float servingCount) {
		this.servingCount = servingCount;
	}

	public float getPartyCakeServing() {
		return partyCakeServing;
	}

	public void setPartyCakeServing(float partyCakeServing) {
		this.partyCakeServing = partyCakeServing;
	}

	public float getCupsOfBatter() {
		return cupsOfBatter;
	}

	public void setCupsOfBatter(float cupsOfBatter) {
		this.cupsOfBatter = cupsOfBatter;
	}

	public float getCupsOfIcing() {
		return cupsOfIcing;
	}

	public void setCupsOfIcing(float cupsOfIcing) {
		this.cupsOfIcing = cupsOfIcing;
	}

	public float getCupsOfFilling() {
		return cupsOfFilling;
	}

	public void setCupsOfFilling(float cupsOfFilling) {
		this.cupsOfFilling = cupsOfFilling;
	}

	public float getPoundsOfFondant() {
		return poundsOfFondant;
	}

	public void setPoundsOfFondant(float poundsOfFondant) {
		this.poundsOfFondant = poundsOfFondant;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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
