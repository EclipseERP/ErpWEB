package com.ets.csm.repository;
import org.springframework.data.repository.CrudRepository;

import com.ets.csm.model.Transport;

public interface TransportRepository extends CrudRepository<Transport,Long> {
	public Transport findFirstIdByOrderByIdDesc();

}
