package com.ets.csm.repository;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import com.ets.csm.model.Projects;

public interface ProjectRepositoryCustom {
	
	Session getSession();
}
