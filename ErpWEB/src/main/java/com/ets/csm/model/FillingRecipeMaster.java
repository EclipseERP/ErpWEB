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
@Table(name ="filling_recipe_master")
public class FillingRecipeMaster {
	
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
	
	@Column(name = "filling_name")
	private String fillingName;
		
	@OneToMany(mappedBy="fillingRecipeMaster",cascade=CascadeType.ALL)
	@JsonIgnore
	private Set<FillingRecipeIngredients> fillingRecipeIngredients;

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

	public String getFillingName() {
		return fillingName;
	}

	public void setFillingName(String fillingName) {
		this.fillingName = fillingName;
	}

	public Set<FillingRecipeIngredients> getFillingRecipeIngredients() {
		return fillingRecipeIngredients;
	}

	public void setFillingRecipeIngredients(Set<FillingRecipeIngredients> fillingRecipeIngredients) {
		this.fillingRecipeIngredients = fillingRecipeIngredients;
	}

	
	
}
