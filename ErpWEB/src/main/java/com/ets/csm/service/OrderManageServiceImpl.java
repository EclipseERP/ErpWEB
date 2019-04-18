package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.OrderManage;
import com.ets.csm.repository.OrderManageRepository;

@Service
public class OrderManageServiceImpl implements OrderManageService{
	
	@Autowired
	OrderManageRepository orderManageRepository;

	@Override
	public List getAllOrderManage() {
		return orderManageRepository.getAllOrderManage();
	}

	@Override
	public List getAllOrderManageBYid(Integer id) {
		return orderManageRepository.getAllOrderManageByid(id);
	}

	@Override
	public OrderManage getAllOrderManageById(Integer id) {
		return orderManageRepository.getallOrderManageById(id);
	}

	@Override
	public List getAllOrderManageBYUsername(String username) {
		return orderManageRepository.getAllOrderManageBYUserid(username);
	}

	@Override
	public OrderManage getOrderManageByMaxid() {
		return orderManageRepository.getOrderManageByMaxid();
	}

	@Override
	public void saveOrderManage(OrderManage ordm) {
		orderManageRepository.save(ordm);
		
	}

	@Override
	public void removeOrderManage(OrderManage ordm) {
		orderManageRepository.delete(ordm);
		
	}

	@Override
	public void saveOrUpdateOrderManage(OrderManage ordm) {
		orderManageRepository.save(ordm);
		
	}
	
	@Override
	public List getAllOrderManageBYUsername_And_paymentstatus(String username) {
		return orderManageRepository.getAllOrderManageBYUserid_And_paymentStatus(username);
	}

	@Override
	public List getQutoUser(String userName) {
		return orderManageRepository.getQutoUser(userName);
	}

	@Override
	public List getAllCupCakeOrderManageBYUsername(String username) {
		return orderManageRepository.getAllCupCakeOrderManageBYUserid(username);
	}
	
	@Override
	public void removeCupCakeOrderManage(OrderManage cupCakeOrderManage) {
		orderManageRepository.delete(cupCakeOrderManage);
	}
	
	@Override
	public int totalOrders(String userName) {
		return orderManageRepository.totalOrders(userName);
	}

}
