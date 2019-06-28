package com.ets.csm.repository;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

public class ProjectRepositoryCustomImpl implements ProjectRepositoryCustom {
	@Autowired
	EntityManager em;
	@Override
	public Session getSession() {
		return em.unwrap(Session.class);

	}

}
