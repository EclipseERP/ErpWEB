package com.ets.csm.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="recipe_master")
public class RecipeMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "status")
	private int status;
	
	@CreationTimestamp
	@Column(name = "created_Date")
	private Date createDate;
	
	@UpdateTimestamp
	@Column(name = "updated_Date")
	private Date updatedDate;
	
	@Column(name = "recipe_name")
	private String recipeName;
	
	@Column(name = "recipe_type")
	private String recipeType;
	
	@Column(name = "price_per_serving")
	private float pricePerServing;
	
	@Column(name = "batter")
	private float batter;
	
	@Column(name = "measurement")
	private float measure;
		
	@OneToMany(mappedBy="recipe",cascade=CascadeType.ALL)
	@JsonIgnore
	private Set<RecipeIngredients> recipeIngredients;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getRecipeType() {
		return recipeType;
	}

	public void setRecipeType(String recipeType) {
		this.recipeType = recipeType;
	}

	public float getPricePerServing() {
		return pricePerServing;
	}

	public void setPricePerServing(float pricePerServing) {
		this.pricePerServing = pricePerServing;
	}

	public float getBatter() {
		return batter;
	}

	public void setBatter(float batter) {
		this.batter = batter;
	}

	public float getMeasure() {
		return measure;
	}

	public void setMeasure(float measure) {
		this.measure = measure;
	}

	public Set<RecipeIngredients> getRecipeIngredients() {
		return recipeIngredients;
	}

	public void setRecipeIngredients(Set<RecipeIngredients> recipeIngredients) {
		this.recipeIngredients = recipeIngredients;
	}

	
		
	
}
