package com.ets.csm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.event.spi.EventType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cake_email_template_master")
public class CupCake_Email_Template {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private int sid;
	
	@Column(name = "eventtype")
	private String eventtype;
   
	@Column(name = "tempcontent")
	private String tempcontent;
	
	@Column(name = "tempheading")
	private String tempheading;
	

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getTempcontent() {
		return tempcontent;
	}
	public void setTempcontent(String tempcontent) {
		this.tempcontent = tempcontent;
	}

	public String getEventtype() {
		return eventtype;
	}
	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
	
	public String getTempheading() {
		return tempheading;
	}
	public void setTempheading(String tempheading) {
		this.tempheading = tempheading;
	}
	public CupCake_Email_Template() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CupCake_Email_Template(int sid, String eventtype, String tempcontent, String tempheading) {
		super();
		this.sid = sid;
		this.eventtype = eventtype;
		this.tempcontent = tempcontent;
		this.tempheading = tempheading;
	}

	

}
