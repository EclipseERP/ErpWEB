package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.PaymentMethod;

public interface PaymentMethodService {
	
	public List getAllPaymentMethod();
	 
	public List getAllPaymentMethodBYid(Integer id);
	
	public PaymentMethod getallPaymentMethodById(Integer id);

	public void savePaymentMethod(PaymentMethod pmd);
	
	public void removePaymentMethod(PaymentMethod pmd);

	public void saveOrUpdatePaymentMethod(PaymentMethod pmd);

}
