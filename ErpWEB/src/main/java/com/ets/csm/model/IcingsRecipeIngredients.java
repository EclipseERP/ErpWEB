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
@Table(name = "icing_recipe_ingredients")
public class IcingsRecipeIngredients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="icing_user_id")
	private IcingsMaster icingsMaster;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name= "ingredients_Id")
	private IngredientsMaster ingredientsMaster;
	
	@Column(name = "measurement")
	private float measure;
	
	@CreationTimestamp
	@Column(name = "created_Date")
	private Date createDate;
	
	@UpdateTimestamp
	@Column(name = "updated_Date")
	private Date updatedDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name= "unit_Id")
	private Unit unit;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IngredientsMaster getIngredientsMaster() {
		return ingredientsMaster;
	}

	public void setIngredientsMaster(IngredientsMaster ingredientsMaster) {
		this.ingredientsMaster = ingredientsMaster;
	}

	public float getMeasure() {
		return measure;
	}

	public void setMeasure(float measure) {
		this.measure = measure;
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

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public IcingsMaster getIcingsMaster() {
		return icingsMaster;
	}

	public void setIcingsMaster(IcingsMaster icingsMaster) {
		this.icingsMaster = icingsMaster;
	}
	
}
