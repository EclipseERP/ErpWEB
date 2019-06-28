package com.ets.csm.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="transport")
public class Transport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="transport_id")
	private Long id;
	@Column(name="transport_code")
	private String transportCode;
	@Column(name="transport_no")
	private String transportNo;
	private Integer capacity;
	@Column(name="transport_name")
	private String transportName;
	@ManyToMany(mappedBy="transports",cascade=CascadeType.ALL)
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
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public String getTransportName() {
		return transportName;
	}
	public void setTransportName(String transportName) {
		this.transportName = transportName;
	}
	public String getTransportNo() {
		return transportNo;
	}
	public void setTransportNo(String transportNo) {
		this.transportNo = transportNo;
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
		return "Transport [id=" + id + ", transportCode=" + transportCode + ", capacity=" + capacity + ", transportName="
				+ transportName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capacity == null) ? 0 : capacity.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((transportCode == null) ? 0 : transportCode.hashCode());
		result = prime * result + ((transportName == null) ? 0 : transportName.hashCode());
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
		if (capacity == null) {
			if (other.capacity != null)
				return false;
		} else if (!capacity.equals(other.capacity))
			return false;
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
		if (transportName == null) {
			if (other.transportName != null)
				return false;
		} else if (!transportName.equals(other.transportName))
			return false;
		return true;
	}
	

}
