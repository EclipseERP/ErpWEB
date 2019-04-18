package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.PaymentMethod;
import com.ets.csm.repository.PayentMethodRepository;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService{
	
	@Autowired
	PayentMethodRepository  payentMethodRepository;

	@Override
	public List getAllPaymentMethod() {
		
		return payentMethodRepository.getAllPaymentMethod();
	}

	@Override
	public List getAllPaymentMethodBYid(Integer id) {
		
		return payentMethodRepository.getAllPaymentMethodByid(id);
	}

	@Override
	public PaymentMethod getallPaymentMethodById(Integer id) {
		
		return payentMethodRepository.getallPaymentMethodById(id);
	}

	@Override
	public void savePaymentMethod(PaymentMethod pmd) {
		
		payentMethodRepository.save(pmd);
	}

	@Override
	public void removePaymentMethod(PaymentMethod pmd) {
		
		payentMethodRepository.delete(pmd);
	}

	@Override
	public void saveOrUpdatePaymentMethod(PaymentMethod pmd) {
		
		payentMethodRepository.save(pmd);
	}
	
	

}
