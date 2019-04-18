package com.ets.csm.service;

import java.util.List;
import java.util.Optional;

import com.ets.csm.model.Subscription;


public interface SubscriptionService {
	public void saveSubscription(Subscription subsc);
	public List getAllSubscription(); 
	public List getSubscriptionDataByID(String planName);
	public Optional<Subscription> findById(Integer id);
	public Subscription saveOrUpdate(Subscription subsc);
	public List getAll();
	public void remove(Subscription subsc);
}
