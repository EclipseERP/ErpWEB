package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Customer;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query("SELECT C FROM Customer C order by C.id desc")
	public List getAllCustomer();
	
	@Query("SELECT C FROM Customer C WHERE C.id =:id")
	public Customer getAllCustomerBYid(@Param ("id") Integer id);
	
	
	@Query("SELECT C FROM Customer C WHERE C.user.userName =:userName")
	public List getAllCustomerBYUserid(@Param ("userName") String userName);
	
	@Query("SELECT COUNT(*) FROM Customer C WHERE C.user.userName =:userName")
	public int totalCustomers(@Param ("userName") String userName);
	
	
	@Query("SELECT C FROM Customer C WHERE C.brideEmail =:brideEmail")
	public Customer getAllCustomerBYEmail(@Param ("brideEmail") String brideEmail);
	
}
