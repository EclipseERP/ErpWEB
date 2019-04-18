package com.ets.csm.model;

import java.util.Date;

import javax.persistence.CascadeType;
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
@Table(name = "layer_details")
public class LayerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="cake_id")
	private Cake cake;
	
	//tierShapeID
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="tier_details_id")
	private TierDetails tierDetails;
	
	@Column(name = "layer_order")
	private int layerOrder;
	
	@Column(name = "has_Filling")
	private int hasFilling;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="recipeUser_id")
	private RecipeUser recipeUser;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="fillingUser_id")
	private FillingsUser fillingsUser;
	
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

	public Cake getCake() {
		return cake;
	}

	public void setCake(Cake cake) {
		this.cake = cake;
	}

	public TierDetails getTierDetails() {
		return tierDetails;
	}

	public void setTierDetails(TierDetails tierDetails) {
		this.tierDetails = tierDetails;
	}

	public int getLayerOrder() {
		return layerOrder;
	}

	public void setLayerOrder(int layerOrder) {
		this.layerOrder = layerOrder;
	}

	public int getHasFilling() {
		return hasFilling;
	}

	public void setHasFilling(int hasFilling) {
		this.hasFilling = hasFilling;
	}

	public RecipeUser getRecipeUser() {
		return recipeUser;
	}

	public void setRecipeUser(RecipeUser recipeUser) {
		this.recipeUser = recipeUser;
	}

	public FillingsUser getFillingsUser() {
		return fillingsUser;
	}

	public void setFillingsUser(FillingsUser fillingsUser) {
		this.fillingsUser = fillingsUser;
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
