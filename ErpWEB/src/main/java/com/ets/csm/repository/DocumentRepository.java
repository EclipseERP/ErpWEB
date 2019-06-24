package com.ets.csm.repository;

import org.springframework.data.repository.CrudRepository;

import com.ets.csm.model.Document;

public interface DocumentRepository extends CrudRepository<Document, Long> {
	
	

}
