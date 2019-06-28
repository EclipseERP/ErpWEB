package com.ets.csm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Transport;
import com.ets.csm.repository.TransportRepository;

@Service
public class TransportServiceImpl implements TransportService {
	@Autowired
	TransportRepository transrepo;
	@Override
	public void save(Transport transport) {
		
		transrepo.save(transport);
	}
		@Override
	public Long getFirstId() {
			try {
				if(transrepo.findFirstIdByOrderByIdDesc()==null) {
					return 1L;
				}else {
					Long id = transrepo.findFirstIdByOrderByIdDesc().getId();
					System.out.println(id);
					return id+1L;
				}
			}catch(Exception e) {
				return 1L;
			}
		
	}
		@Override
		public List<Transport> getAll() {
			// TODO Auto-generated method stub
			try {
			List<Transport> transports = new ArrayList<>();
			 transrepo.findAll().forEach(transports::add);
			 return transports;
			}catch(Exception e) {
				return new ArrayList<>();
				
			} 
		}
	

	
}
