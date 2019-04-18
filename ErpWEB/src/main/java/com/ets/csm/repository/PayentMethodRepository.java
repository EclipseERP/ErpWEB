package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.PaymentMethod;

@Repository("payMethodRepository")
public interface PayentMethodRepository extends JpaRepository<PaymentMethod, Integer>{
	
	@Query("SELECT PMD FROM PaymentMethod PMD")
	public List getAllPaymentMethod();
	
	@Query("SELECT PMD FROM PaymentMethod PMD WHERE PMD.id =:id")
	public List getAllPaymentMethodByid(@Param ("id") Integer id);
	
	@Query("SELECT PMD FROM PaymentMethod PMD WHERE PMD.id =:id")
	public PaymentMethod getallPaymentMethodById(@Param ("id") Integer id);

}
