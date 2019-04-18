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
@Table(name ="order_manage")
public class OrderManage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="event_id")
	private Events events;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="venue_id")
	private Venue venue;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="cake_id")
	private Cake cake;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="payment_method_id")
	private PaymentMethod payModeId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="cupCake_id")
	private CupCake cupCake;
	
	@CreationTimestamp
	@Column(name = "payment_Date")
	private Date paymentAt;
	
	@UpdateTimestamp
	@Column(name = "payment_due_Date")
	private Date paymentDueDate;
	
	@CreationTimestamp
	@Column(name = "created_Date")
	private Date createDate;
	
	@UpdateTimestamp
	@Column(name = "updated_Date")
	private Date updatedDate;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "order_status")
	private int orderStatus;
	
	@Column(name = "dlivery_status")
	private String deliveryStatus;
	
	@Column(name = "notes")
	private String notes;
	
	@Column(name = "orderID")
	private String orderID;
	
	@Column(name = "invoiceId")
	private String invoiceId;
	
	@Column(name = "payment_occur")
	private int paymentOccurrence;
	
	@Column(name = "total_amount")
	private float totalAmount;
	
	@Column(name = "payment_amount")
	private float paymentAmount;
	
	@Column(name = "amount_due")
	private float amountDue;
	
	@Column(name = "return_Item_Deposit")
	private float returnableItemDeposit;

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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getPaymentAt() {
		return paymentAt;
	}

	public void setPaymentAt(Date paymentAt) {
		this.paymentAt = paymentAt;
	}

	public Date getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
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

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getPaymentOccurrence() {
		return paymentOccurrence;
	}

	public void setPaymentOccurrence(int paymentOccurrence) {
		this.paymentOccurrence = paymentOccurrence;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public float getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(float paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public float getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(float amountDue) {
		this.amountDue = amountDue;
	}

	public float getReturnableItemDeposit() {
		return returnableItemDeposit;
	}

	public void setReturnableItemDeposit(float returnableItemDeposit) {
		this.returnableItemDeposit = returnableItemDeposit;
	}

	public PaymentMethod getPayModeId() {
		return payModeId;
	}

	public void setPayModeId(PaymentMethod payModeId) {
		this.payModeId = payModeId;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Cake getCake() {
		return cake;
	}

	public void setCake(Cake cake) {
		this.cake = cake;
	}

	public CupCake getCupCake() {
		return cupCake;
	}

	public void setCupCake(CupCake cupCake) {
		this.cupCake = cupCake;
	}
	
	
	

}
