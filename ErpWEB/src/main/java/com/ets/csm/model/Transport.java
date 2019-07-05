package com.ets.csm.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="transport")
public class Transport implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="transport_id")
	private Long id;
	
	@Column(name="transport_code")
	private String transportCode;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="transport_Name")
	private String transport_Name;
	
	@Column(name="truckNo")
	private String truckNo;
	
	@Column(name="billNo")
	private String billNo;
	
	@Column(name="distance")
	private String distance;
	
	@Column(name="rate")
	private double rate;
	
	@OneToMany
	@JoinColumn(name="material")
	private List<MaterialsMaster> material;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)	
	private Set<Projects> project;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTransportCode() {
		return transportCode;
	}
	public void setTransportCode(String transportCode) {
		this.transportCode = transportCode;
	}
	
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTransporterName() {
		return transport_Name;
	}
	public void setTransporterName(String transporter_Name) {
		this.transport_Name = transporter_Name;
	}
	public String getTruckNo() {
		return truckNo;
	}
	public void setTruckNo(String truckNo) {
		this.truckNo = truckNo;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public List getMaterial() {
		return material;
	}
	public void setMaterial(List material) {
		this.material = material;
	}
	public Set<Projects> getProject() {
		if(project.isEmpty()|| project==null) {
			return new HashSet<Projects>();
		}
		return project;
	}
	public void setProject(Set<Projects> projectss) {
		if(projectss==null || projectss.isEmpty()) {
			this.project=new HashSet<>();
		}
		this.project = projectss;
	}
	@Override
	public String toString() {
		return "Transport [id=" + id + ", transportCode=" + transportCode + ", description="
				+ destination + ", truckNo="+truckNo+", billNo="+billNo+", distance="+distance+", rate"+rate+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((transportCode == null) ? 0 : transportCode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transport other = (Transport) obj;
		
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (transportCode == null) {
			if (other.transportCode != null)
				return false;
		} else if (!transportCode.equals(other.transportCode))
			return false;
		
		return true;
	}
	

}
