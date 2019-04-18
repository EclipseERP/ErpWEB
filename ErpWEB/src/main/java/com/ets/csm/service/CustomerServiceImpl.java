package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ets.csm.model.Customer;
import com.ets.csm.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
    public List getAllCustomer() {
		
		return customerRepository.getAllCustomer();
	}
	
	@Override
	public Customer getAllCustomerBYid(Integer id) {
		return customerRepository.getAllCustomerBYid(id);
	}
	
	public List getAllCustomerBYUserid(String userName) {
		return customerRepository.getAllCustomerBYUserid(userName);
	}

	@Override
	public void saveCustomer(Customer cus) {
		
		customerRepository.save(cus);
		
	}

	@Override
	public void removeCustomer(Customer cus) {
	
		customerRepository.delete(cus);
		
	}

	@Override
	public Customer saveOrUpdate(Customer cus) {
		
		return customerRepository.save(cus);
	}

	@Override
	public int totalCustomers(String userName) {
		
		return customerRepository.totalCustomers(userName);
	}

	@Override
	public Customer getCustomerBYEmail(String email) {
	
		return customerRepository.getAllCustomerBYEmail(email);
	}
	
	
	
	
}
