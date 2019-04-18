package com.ets.csm.model;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="default_email_text")
public class DefaultEmailText {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Lob
	@Column(name = "text_content")
	private byte[] textContent;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="email_event_type_id")
	private EmailEventType emailEventType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="email_event_sub_type_id")
	private EmailEventSubType emailEventSubType;
	
	@Column(name = "send_days")
	private int sentDays;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	@Column(name = "after_event_type")
	private String afterEventType;

	@Column(name = "prior")
	private int prior;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getTextContent() {
		return textContent;
	}

	public void setTextContent(byte[] textContent) {
		this.textContent = textContent;
	}

	public EmailEventType getEmailEventType() {
		return emailEventType;
	}

	public void setEmailEventType(EmailEventType emailEventType) {
		this.emailEventType = emailEventType;
	}

	public EmailEventSubType getEmailEventSubType() {
		return emailEventSubType;
	}

	public void setEmailEventSubType(EmailEventSubType emailEventSubType) {
		this.emailEventSubType = emailEventSubType;
	}

	public int getSentDays() {
		return sentDays;
	}

	public void setSentDays(int sentDays) {
		this.sentDays = sentDays;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAfterEventType() {
		return afterEventType;
	}

	public void setAfterEventType(String afterEventType) {
		this.afterEventType = afterEventType;
	}

	public int getPrior() {
		return prior;
	}

	public void setPrior(int prior) {
		this.prior = prior;
	}
	
}
