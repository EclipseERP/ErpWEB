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
@Table (name = "RecipePricingUser")
public class RecipePricingUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "cupCakeId")
	private CpCakePricingUser cupCake;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "base_price_per_dozen")
	private float basePricePerDozen;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "recipe_id")
	private RecipeUser recipeUser;
	
	@CreationTimestamp
	@Column(name = "created_Date")
	private Date createDate;
	
	@UpdateTimestamp
	@Column(name = "updated_Date")
	private Date updatedDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public CpCakePricingUser getCupCake() {
		return cupCake;
	}

	public void setCupCake(CpCakePricingUser cupCake) {
		this.cupCake = cupCake;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
	public float getBasePricePerDozen() {
		return basePricePerDozen;
	}

	public void setBasePricePerDozen(float basePricePerDozen) {
		this.basePricePerDozen = basePricePerDozen;
	}

	public RecipeUser getRecipeUser() {
		return recipeUser;
	}

	public void setRecipeUser(RecipeUser recipeUser) {
		this.recipeUser = recipeUser;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
