package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ets.csm.model.Payment;


public interface TurnOverRepository extends CrudRepository<Payment, Long> {
		public List<Payment> findByProject_id(Long id);
}
