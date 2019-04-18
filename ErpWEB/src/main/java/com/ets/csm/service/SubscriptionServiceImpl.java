package com.ets.csm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Subscription;
import com.ets.csm.repository.SubscriptionRepository;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
	
	@Autowired
	private SubscriptionRepository subscRepository;

	@Override
	public void saveSubscription(Subscription subsc) {
		
		subscRepository.save(subsc);
		
	}

	@Override
	public List getAllSubscription() {
		
		return subscRepository.getAllSubscription();
	}

	@Override
	public List getSubscriptionDataByID(String planName) {
		
		return subscRepository.getSubscriptionDataByID(planName);
	}

	@Override
	public Optional<Subscription> findById(Integer id) {
		
		return subscRepository.findById(id);
	}
	
	@Override
	public Subscription saveOrUpdate(Subscription subsc) {
		
		return subscRepository.save(subsc);
	}

	@Override
	public List getAll() {
		
		return subscRepository.findAll();
	}

	
	@Override
	public void remove(Subscription subsc) {
	
		subscRepository.delete(subsc);
		
	}

	

	
}
