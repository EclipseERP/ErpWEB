package com.ets.csm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transport")
public class Transport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	private String transportId;
	private String transportNo;
	private Integer capacity;
	private String transportName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTransportId() {
		return transportId;
	}
	public void setTransportId(String transportId) {
		this.transportId = transportId;
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
	@Override
	public String toString() {
		return "Transport [id=" + id + ", transportId=" + transportId + ", capacity=" + capacity + ", transportName="
				+ transportName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capacity == null) ? 0 : capacity.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((transportId == null) ? 0 : transportId.hashCode());
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
		if (transportId == null) {
			if (other.transportId != null)
				return false;
		} else if (!transportId.equals(other.transportId))
			return false;
		if (transportName == null) {
			if (other.transportName != null)
				return false;
		} else if (!transportName.equals(other.transportName))
			return false;
		return true;
	}
	

}