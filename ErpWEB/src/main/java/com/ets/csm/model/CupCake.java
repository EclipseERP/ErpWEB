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
@Table(name ="cup_cake")
public class CupCake {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "cup_cake_name")
	private String cupCakeName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="cupcake_pricing_user_id")
	private CpCakePricingUser cpCkPricingUser;
	
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
	@JoinColumn(name="recipeUser_id")
	private RecipeUser recipe;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="icing_user_id")
	private IcingsUser icingUser;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="fillingUser_id")
	private FillingsUser fillingsUser;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="toppingUser_id")
	private ToppingsUser toppingUser;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="wrapping_user_id")
	private WrapperUser wrappingUser;	
	
	@Column(name = "cup_cake_number")
	private int numOfCpCk;

	@Column(name = "description")
	private String desc;
	
	@Column(name = "ingredientCost")
	private float ingCost;
	
	@Column(name = "costPerHour")
	private float costPerHour;
	
	@Column(name = "serving")
	private int servings;
	
	@Column(name = "bakingTime")
	private float bakingTime;
	
	@Column(name = "total_Adornment_Price")
	private float totalAdornPrice;
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCupCakeName() {
		return cupCakeName;
	}

	public void setCupCakeName(String cupCakeName) {
		this.cupCakeName = cupCakeName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CpCakePricingUser getCpCkPricingUser() {
		return cpCkPricingUser;
	}

	public void setCpCkPricingUser(CpCakePricingUser cpCkPricingUser) {
		this.cpCkPricingUser = cpCkPricingUser;
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

	public float getTotalAdornPrice() {
		return totalAdornPrice;
	}

	public void setTotalAdornPrice(float totalAdornPrice) {
		this.totalAdornPrice = totalAdornPrice;
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
	
	public IcingsUser getIcingUser() {
		return icingUser;
	}

	public void setIcingUser(IcingsUser icingUser) {
		this.icingUser = icingUser;
	}

	public FillingsUser getFillingsUser() {
		return fillingsUser;
	}

	public void setFillingsUser(FillingsUser fillingsUser) {
		this.fillingsUser = fillingsUser;
	}

	public ToppingsUser getToppingUser() {
		return toppingUser;
	}

	public void setToppingUser(ToppingsUser toppingUser) {
		this.toppingUser = toppingUser;
	}

	public WrapperUser getWrappingUser() {
		return wrappingUser;
	}

	public void setWrappingUser(WrapperUser wrappingUser) {
		this.wrappingUser = wrappingUser;
	}

	public int getNumOfCpCk() {
		return numOfCpCk;
	}

	public void setNumOfCpCk(int numOfCpCk) {
		this.numOfCpCk = numOfCpCk;
	}
	
}
