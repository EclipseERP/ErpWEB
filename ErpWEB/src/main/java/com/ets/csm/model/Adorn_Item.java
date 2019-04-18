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
@Table(name = "Adorn_Item")
public class Adorn_Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "item_name")
	private String item_name;
	
	@Column(name = "item_price")
	private String itemPrice;
	
	@Column(name = "item_cost")
	private String itemCost;
	
	@Column(name = "item_vender")
	private String itemVender;
	
	/*@Column(name = "Status")
	private int status;
	*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="Adorn_Cat_id")
	private Adorn_Cat adorn_Cat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	/*public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}*/

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Adorn_Cat getAdorn_Cat() {
		return adorn_Cat;
	}

	public void setAdorn_Cat(Adorn_Cat adorn_Cat) {
		this.adorn_Cat = adorn_Cat;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemCost() {
		return itemCost;
	}

	public void setItemCost(String itemCost) {
		this.itemCost = itemCost;
	}

	public String getItemVender() {
		return itemVender;
	}

	public void setItemVender(String itemVender) {
		this.itemVender = itemVender;
	}


}
