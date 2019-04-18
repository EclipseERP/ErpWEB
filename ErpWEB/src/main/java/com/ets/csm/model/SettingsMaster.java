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
@Table(name ="settings")
public class SettingsMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="admin_user_id")
	private User user;
	
	@Column(name="slug")
	private String slug;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="type")
	private String type;
	

	@Column(name="defaultText")
	private String defaultText;
	
	@Column(name="value")
	private String value;
	
	@Column(name="options")
	private String options;
	
	@Column(name="is_required")
	private int is_required;
	
	@Column(name="is_gui")
	private int is_gui;
	
	@Column(name="module")
	private String module;
	
	@Column(name="row_order")
    private int row_order;

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

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDefaultText() {
		return defaultText;
	}

	public void setDefaultText(String defaultText) {
		this.defaultText = defaultText;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public int getIs_required() {
		return is_required;
	}

	public void setIs_required(int is_required) {
		this.is_required = is_required;
	}

	public int getIs_gui() {
		return is_gui;
	}

	public void setIs_gui(int is_gui) {
		this.is_gui = is_gui;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public int getRow_order() {
		return row_order;
	}

	public void setRow_order(int row_order) {
		this.row_order = row_order;
	}

	public SettingsMaster(int id, User user, String slug, String title, String description, String type,
			String defaultText, String value, String options, int is_required, int is_gui, String module,
			int row_order) 
	{

		super();
		this.id = id;
		this.user = user;
		this.slug = slug;
		this.title = title;
		this.description = description;
		this.type = type;
		this.defaultText = defaultText;
		this.value = value;
		this.options = options;
		this.is_required = is_required;
		this.is_gui = is_gui;
		this.module = module;
		this.row_order = row_order;
	}

	public SettingsMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
