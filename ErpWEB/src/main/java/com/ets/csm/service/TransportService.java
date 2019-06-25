package com.ets.csm.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ets.csm.model.Transport;

public interface TransportService {
	
	public void save(Transport transport);
	
	
	public Long  getFirstId();
	public List<Transport> getAll();

}
