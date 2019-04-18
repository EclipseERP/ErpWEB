package com.ets.csm.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.ets.csm.model.OrderManage;

public interface OrderManageService {

	public List getAllOrderManage();
	 
	public List getAllOrderManageBYid(Integer id);
	
	public OrderManage getAllOrderManageById(Integer id);
	 
	public List getAllOrderManageBYUsername(String username);
	
	public List getQutoUser(String userName);

	public OrderManage getOrderManageByMaxid();
	
	public void saveOrderManage(OrderManage ordm);
	
	public void removeOrderManage(OrderManage ordm);

	public void saveOrUpdateOrderManage(OrderManage ordm);
	
	public List getAllOrderManageBYUsername_And_paymentstatus(String username);

	public List getAllCupCakeOrderManageBYUsername(String userName);

	public void removeCupCakeOrderManage(OrderManage cupCakeOrderManage);
	
	public int totalOrders(String userName);
	
	
	
	
	
	
}
