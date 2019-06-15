package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.Payment;


public interface PaymentService {
	public  String save(Payment payment);
	public  List<Payment> findAllPayements();
	public List<Payment> findAllPaymentsByProjectId(Long id);
	
	public void deletePaymentsByProjectId(Long id);

}
