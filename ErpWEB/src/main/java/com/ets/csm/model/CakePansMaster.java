package com.ets.csm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "cakePanMaster")
public class CakePansMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "cakePanShape")
	private String cakePanShape;
	
	@Column(name = "cakePansize")
	private String cakePansize;
	
	@Column(name = "partyCakeServing")
	private int partyCakeserving;
	
	@Column(name = "weddingCakeServing")
	private int weddingCakeserving;
	
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

	public String getCakePanShape() {
		return cakePanShape;
	}

	public void setCakePanShape(String cakePanShape) {
		this.cakePanShape = cakePanShape;
	}

	public String getCakePansize() {
		return cakePansize;
	}

	public void setCakePansize(String cakePansize) {
		this.cakePansize = cakePansize;
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

	public int getPartyCakeserving() {
		return partyCakeserving;
	}

	public void setPartyCakeserving(int partyCakeserving) {
		this.partyCakeserving = partyCakeserving;
	}

	public int getWeddingCakeserving() {
		return weddingCakeserving;
	}

	public void setWeddingCakeserving(int weddingCakeserving) {
		this.weddingCakeserving = weddingCakeserving;
	}

	

}
