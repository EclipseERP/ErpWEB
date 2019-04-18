package com.ets.csm.service;

import java.util.List;
import com.ets.csm.model.Customer;

public interface CustomerService {

	 public List getAllCustomer();
	 
	 public Customer getAllCustomerBYid(Integer id);
	 
	 public List getAllCustomerBYUserid(String userName);
	 
	 public void saveCustomer(Customer cus);
	
	 public void removeCustomer(Customer cus);

	 public Customer saveOrUpdate(Customer cus);
	
	 public int totalCustomers(String userName);
	
	 public Customer getCustomerBYEmail(String userName);
	
}
