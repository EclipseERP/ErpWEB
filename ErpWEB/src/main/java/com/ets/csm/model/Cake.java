package com.ets.csm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="cake")
public class Cake {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "cake_name")
	private String cakeName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	@CreationTimestamp
	@Column(name = "created_Date")
	private Date createDate;
	
	@UpdateTimestamp
	@Column(name = "updated_Date")
	private Date updatedDate;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "price_Per_Serving")
	private float pricePerServing;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="event_id")
	private Events events;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="venue_id")
	private Venue venue;
	
	@Column(name = "event_Date")
	private Date eventDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="materialUserId")
	private MaterialsUser material;
	
	@Column(name = "no_of_tiers")
	private int tiers;
	
	@Column(name = "cake_type")
	private Integer cakeType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="recipeUser_id")
	private RecipeUser recipe;
	
	@Column(name = "description")
	private String desc;
	
	@Column(name = "pricingMethod")
	private int pricingMethod;
	
	@Column(name = "ingredientCost")
	private float ingCost;
	
	@Column(name = "costPerHour")
	private float costPerHour;
	
	@Column(name = "serving")
	private int servings;
	
	@Column(name = "bakingTime")
	private float bakingTime;
	
	@Column(name = "method1_base_retail")
	private float method1BaseRetail;
	
	@Column(name = "method2_base_retail")
	private float method2BaseRetail;
	
	@Column(name = "total_Adornment_Price")
	private float totalAdornPrice;
	
	@Column(name = "method1_total_price")
	private float method1totalPrice;
	
	@Column(name = "method2_total_price")
	private float method2totalPrice;
	
	@Column(name = "priceOverride")
	private float priceOverride;
	
	@Column(name = "taxrate")
	private float taxrate;
	
	@Column(name = "taxAmount")
	private float taxAmount;
	
	@Column(name = "deliveryCharge")
	private float deliveryCharge;
	
	@Column(name = "discountType")
	private int discountType;
	
	@Column(name = "discountRate")
	private float discountRate;
	
	@Column(name = "reason_of_Discount")
	private String discountReason;
	
	@Column(name = "returnable_Item_Deposit")
	private float returnItem;
	
	@Column(name = "gtotal")
	private float gtotal;
	
	@Column(name = "orderStatus")
	private int orderStatus;
	
	@Column(name = "predefined")
	private int predefined;
	
	@Lob
	@Column(name = "predefined_image")
	private byte[] predefinedImage;
	
	@Column(name = "predefined_angle")
	private int predefinedAngle;
	
	@Column(name = "predefined_desc")
	private String predefinedDesc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCakeName() {
		return cakeName;
	}

	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public float getPricePerServing() {
		return pricePerServing;
	}

	public void setPricePerServing(float pricePerServing) {
		this.pricePerServing = pricePerServing;
	}

	public Events getEvents() {
		return events;
	}

	public void setEvents(Events events) {
		this.events = events;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getTiers() {
		return tiers;
	}

	public void setTiers(int tiers) {
		this.tiers = tiers;
	}

	
	
	
	

	public Integer getCakeType() {
		return cakeType;
	}

	public void setCakeType(Integer cakeType) {
		this.cakeType = cakeType;
	}

	public RecipeUser getRecipe() {
		return recipe;
	}

	public void setRecipe(RecipeUser recipe) {
		this.recipe = recipe;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getPricingMethod() {
		return pricingMethod;
	}

	public void setPricingMethod(int pricingMethod) {
		this.pricingMethod = pricingMethod;
	}

	public float getIngCost() {
		return ingCost;
	}

	public void setIngCost(float ingCost) {
		this.ingCost = ingCost;
	}

	public float getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(float costPerHour) {
		this.costPerHour = costPerHour;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public float getBakingTime() {
		return bakingTime;
	}

	public void setBakingTime(float bakingTime) {
		this.bakingTime = bakingTime;
	}

	public float getMethod1BaseRetail() {
		return method1BaseRetail;
	}

	public void setMethod1BaseRetail(float method1BaseRetail) {
		this.method1BaseRetail = method1BaseRetail;
	}

	public float getMethod2BaseRetail() {
		return method2BaseRetail;
	}

	public void setMethod2BaseRetail(float method2BaseRetail) {
		this.method2BaseRetail = method2BaseRetail;
	}

	public float getTotalAdornPrice() {
		return totalAdornPrice;
	}

	public void setTotalAdornPrice(float totalAdornPrice) {
		this.totalAdornPrice = totalAdornPrice;
	}

	public float getMethod1totalPrice() {
		return method1totalPrice;
	}

	public void setMethod1totalPrice(float method1totalPrice) {
		this.method1totalPrice = method1totalPrice;
	}

	public float getMethod2totalPrice() {
		return method2totalPrice;
	}

	public void setMethod2totalPrice(float method2totalPrice) {
		this.method2totalPrice = method2totalPrice;
	}

	public float getPriceOverride() {
		return priceOverride;
	}

	public void setPriceOverride(float priceOverride) {
		this.priceOverride = priceOverride;
	}

	public float getTaxrate() {
		return taxrate;
	}

	public void setTaxrate(float taxrate) {
		this.taxrate = taxrate;
	}

	public float getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(float taxAmount) {
		this.taxAmount = taxAmount;
	}

	public float getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(float deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public int getDiscountType() {
		return discountType;
	}

	public void setDiscountType(int discountType) {
		this.discountType = discountType;
	}

	public float getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}

	public String getDiscountReason() {
		return discountReason;
	}

	public void setDiscountReason(String discountReason) {
		this.discountReason = discountReason;
	}

	public float getReturnItem() {
		return returnItem;
	}

	public void setReturnItem(float returnItem) {
		this.returnItem = returnItem;
	}

	public float getGtotal() {
		return gtotal;
	}

	public void setGtotal(float gtotal) {
		this.gtotal = gtotal;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getPredefined() {
		return predefined;
	}

	public void setPredefined(int predefined) {
		this.predefined = predefined;
	}

	public byte[] getPredefinedImage() {
		return predefinedImage;
	}

	public void setPredefinedImage(byte[] predefinedImage) {
		this.predefinedImage = predefinedImage;
	}

	public int getPredefinedAngle() {
		return predefinedAngle;
	}

	public void setPredefinedAngle(int predefinedAngle) {
		this.predefinedAngle = predefinedAngle;
	}

	public String getPredefinedDesc() {
		return predefinedDesc;
	}

	public void setPredefinedDesc(String predefinedDesc) {
		this.predefinedDesc = predefinedDesc;
	}

	public MaterialsUser getMaterial() {
		return material;
	}

	public void setMaterial(MaterialsUser material) {
		this.material = material;
	}
	
}
