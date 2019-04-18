package com.ets.csm.model;

import java.sql.Date;

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
@Table(name = "sendmails")
public class SendMails {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="userid")
	private User user;
 	
 	@Column(name="subject")
	private String subject;
 	
 	@Column(name="mailcontent")
	private String mailcontent;
 	
 	@Column(name="ccmail")
	private String ccmail;
 	
 	@Column(name="toemailid")
	private String toemailid;
 	
 	@Column(name="datetime")
	private String datetime;
 	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="customerid")
	private Customer customer;
 	
 
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMailcontent() {
		return mailcontent;
	}

	public void setMailcontent(String mailcontent) {
		this.mailcontent = mailcontent;
	}

	public String getCcmail() {
		return ccmail;
	}

	public void setCcmail(String ccmail) {
		this.ccmail = ccmail;
	}

	public String getToemailid() {
		return toemailid;
	}

	public void setToemailid(String toemailid) {
		this.toemailid = toemailid;
	}



	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	public SendMails(int id, User user, String subject, String mailcontent, String ccmail, String toemailid,
			String datetime, Customer customer) {
		super();
		this.id = id;
		this.user = user;
		this.subject = subject;
		this.mailcontent = mailcontent;
		this.ccmail = ccmail;
		this.toemailid = toemailid;
		this.datetime = datetime;
		this.customer = customer;
	}

	public SendMails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	
}
