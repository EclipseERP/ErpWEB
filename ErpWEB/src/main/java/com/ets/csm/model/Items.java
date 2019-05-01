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
import com.ets.csm.model.User;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "item_master")

public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "project_code")
	private String project_code;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(name = "sch_qty1")
	private float sch_qty1;
	
	@Column(name = "sch_qty2")
	private float sch_qty2;
	
	@Column(name = "sch_qty3")
	private float sch_qty3;
	
	@Column(name = "ei_work_indoor1")
	private float ei_work_indoor1;
	
	@Column(name = "ei_work_indoor2")
	private float ei_work_indoor2;
	
	public String getProjectCode() {
		return project_code;
	}

	public void setProjectCode(String project_code) {
		this.project_code = project_code;
	}
	
	public float getschqty1() { return sch_qty1;}
	public void setschqty1(float sch_qty1) {
		this.sch_qty1 = sch_qty1;
	}
	
	public float getschqty2() { return sch_qty2;}
	public void setschqty2(float sch_qty2) {
		this.sch_qty1 = sch_qty2;
	}
	public float getschqty3() { return sch_qty3;}
	public void setschqty3(float sch_qty3) {
		this.sch_qty1 = sch_qty3;
	}
	
	public float geteiworkindoor1() { return ei_work_indoor1;}
	public void seteiworkindoor1(float ei_work_indoor1) {
		this.ei_work_indoor1 = ei_work_indoor1;
	}
	
	public float geteiworkindoor2() { return ei_work_indoor2;}
	public void seteiworkindoor2(float ei_work_indoor2) {
		this.ei_work_indoor2 = ei_work_indoor2;
	}
	
	public Items (int id,String project_code,float sch_qty1,float sch_qty2, float sch_qty3, float ei_work_indoor1,float ei_work_indoor2,User user) {
		super();
		this.id=id;
		this.project_code=project_code;
		this.sch_qty1=sch_qty1;
		this.sch_qty2=sch_qty2;
		this.sch_qty3=sch_qty3;
		this.ei_work_indoor1 = ei_work_indoor1;
		this.ei_work_indoor2 = ei_work_indoor2;
		this.user=user;
		
	}
	
public Items(){
	super();
	// TODO Auto-generated constructor stub
}
	
}
