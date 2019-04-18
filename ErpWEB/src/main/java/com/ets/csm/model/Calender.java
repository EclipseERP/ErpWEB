package com.ets.csm.model;

import java.sql.Timestamp;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "calendar")
public class Calender {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	@Column(name = "type")
	private int type;
	
	@Column(name = "order_id")
	private int order_id;
	
	@Column(name = "topic")
	private String topic;
	
	@Column(name = "appointment_date")
	private Date appointment_date;
	
	@Column(name = "appointment_time")
	private String appointment_time;
	
	@Column(name = "status")
	private int status;
	
	@CreationTimestamp
	@Column(name = "created_at")
	private Date created_at;
	
	@Column(name = "updated_at")
	private Date updated_at;
	
	@Column(name = "bride_fname")
	private String bride_fname;
	
	@Column(name = "bride_lname")
	private String bride_lname;
	
	@Column(name = "groom_fname")
	private String groom_fname;
	
	@Column(name = "groom_lname")
	private String groom_lname;
	
	@Column(name = "address1")
	private String address1;
	
	@Column(name = "address2")
	private String address2;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "zip")
	private int zip;
	
	@Column(name = "bride_email")
	private String bride_email;
	
	@Column(name = "phone_number")
	private String phone_number;
	
	@Column(name = "text_to_phone")
	private int text_to_phone;
	
	@Column(name = "weeding_date")
	private Date weeding_date;
	
	@Column(name = "reception_location")
	private String reception_location;
	
	@Column(name = "theme")
	private String theme;
	
	@Column(name = "no_of_servings")
	private String no_of_servings;
	
	@Column(name = "no_attend_recption")
	private int no_attend_recption;
	
	@Column(name = "event_name")
	private String event_name;
	
	@Column(name = "note")
	private String note;
	
	@Column(name = "cancel_apoint")
	private int cancel_apoint;
	
	@Column(name = "rescdule_appoint")
	private int rescdule_appoint;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="referrals")
	private Referral referral;
	
	
	@Column(name = "convertedTocust")
	private int convertedTocust;
	
	
	
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Date getAppointment_date() {
		return appointment_date;
	}

	public void setAppointment_date(Date appointment_date) {
		this.appointment_date = appointment_date;
	}


	public String getAppointment_time() {
		return appointment_time;
	}

	public void setAppointment_time(String appointment_time) {
		this.appointment_time = appointment_time;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getBride_fname() {
		return bride_fname;
	}

	public void setBride_fname(String bride_fname) {
		this.bride_fname = bride_fname;
	}

	public String getBride_lname() {
		return bride_lname;
	}

	public void setBride_lname(String bride_lname) {
		this.bride_lname = bride_lname;
	}

	public String getGroom_fname() {
		return groom_fname;
	}

	public void setGroom_fname(String groom_fname) {
		this.groom_fname = groom_fname;
	}

	public String getGroom_lname() {
		return groom_lname;
	}

	public void setGroom_lname(String groom_lname) {
		this.groom_lname = groom_lname;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getBride_email() {
		return bride_email;
	}

	public void setBride_email(String bride_email) {
		this.bride_email = bride_email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public int getText_to_phone() {
		return text_to_phone;
	}

	public void setText_to_phone(int text_to_phone) {
		this.text_to_phone = text_to_phone;
	}

	public Date getWeeding_date() {
		return weeding_date;
	}

	public void setWeeding_date(Date weeding_date) {
		this.weeding_date = weeding_date;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getNo_of_servings() {
		return no_of_servings;
	}

	public void setNo_of_servings(String no_of_servings) {
		this.no_of_servings = no_of_servings;
	}

	public int getNo_attend_recption() {
		return no_attend_recption;
	}

	public void setNo_attend_recption(int no_attend_recption) {
		this.no_attend_recption = no_attend_recption;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getCancel_apoint() {
		return cancel_apoint;
	}

	public void setCancel_apoint(int cancel_apoint) {
		this.cancel_apoint = cancel_apoint;
	}

	public int getRescdule_appoint() {
		return rescdule_appoint;
	}

	public void setRescdule_appoint(int rescdule_appoint) {
		this.rescdule_appoint = rescdule_appoint;
	}



	public String getReception_location() {
		return reception_location;
	}

	public void setReception_location(String reception_location) {
		this.reception_location = reception_location;
	}

	public Referral getReferral() {
		return referral;
	}

	public void setReferral(Referral referral) {
		this.referral = referral;
	}

	public int getConvertedTocust() {
		return convertedTocust;
	}

	public void setConvertedTocust(int convertedTocust) {
		this.convertedTocust = convertedTocust;
	}
	
	
	
	
	
}
