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

/**
 * @author Pradipto Roy
 *
 */

@Entity
@Table(name="email_template_for_user")
public class Email_Template_For_User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "eventname")
	private String eventname;
	
	@Column(name = "eventheader")
	private String eventheader;
	
	@Column(name = "tempcontent")
	private String tempcontent;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="userid")
	private User user;
	
	@Column(name = "status")
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getEventheader() {
		return eventheader;
	}

	public void setEventheader(String eventheader) {
		this.eventheader = eventheader;
	}

	public String getTempcontent() {
		return tempcontent;
	}

	public void setTempcontent(String tempcontent) {
		this.tempcontent = tempcontent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Email_Template_For_User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Email_Template_For_User(int id, String eventname, String eventheader, String tempcontent, User user,
			int status) {
		super();
		this.id = id;
		this.eventname = eventname;
		this.eventheader = eventheader;
		this.tempcontent = tempcontent;
		this.user = user;
		this.status = status;
	}


	
}
