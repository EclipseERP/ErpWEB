package com.ets.csm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Payment;
import com.ets.csm.model.Projects;
import com.ets.csm.repository.TurnOverRepository;
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	TurnOverRepository turnoverrepo;
	@Override
	public String save(Payment payment) {
		Projects project = payment.getProject();
		List<Payment> payments = new ArrayList<>();
		payments.add(payment);
		project.setPayments(payments);
		if(turnoverrepo.save(payment).getId()>0) {
			return "Saved SuccessFully";
		}else {
			return "Could not save Data";
		}

	}
	@Override
	public List<Payment> findAllPayements() {
		ArrayList<Payment> paymentsList = new ArrayList<>();
		 turnoverrepo.findAll().forEach(paymentsList::add);
		 return paymentsList;
	}
	@Override
	public List<Payment> findAllPaymentsByProjectId(Long id) {
		
		return turnoverrepo.findByProject_id(id);
	}
	
	@Override
	public void deletePaymentsByProjectId(Long id) {
		
		 turnoverrepo.deleteById(id);
	}
	

}
