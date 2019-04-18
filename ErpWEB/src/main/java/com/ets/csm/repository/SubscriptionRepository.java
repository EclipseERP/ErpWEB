package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Subscription;

@Repository("subscriptionRepository")
public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {
	
	@Query("SELECT S.planName, S.month, S.cost, S.description FROM Subscription S  ")
	public List getAllSubscription();
	
	@Query("SELECT S FROM Subscription S WHERE S.planName =:planName")
	public List getSubscriptionDataByID(@Param ("planName") String planName);

}
