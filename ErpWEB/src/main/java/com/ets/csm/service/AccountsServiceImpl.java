package com.ets.csm.service;
import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ets.csm.model.RawMaterials;
import com.ets.csm.repository.AccountsRepository;
import com.ets.csm.repository.RawMaterialsRepository;

@Service
public class AccountsServiceImpl implements AccountsService{
	 @Autowired
	 AccountsRepository accountsRepository;
	 
	/* @Override
		public List getProjectForTurnoverPageGroupByProjectCode() {
			// TODO Auto-generated method stub
			return accountsRepository.getProjectForTurnoverPageGroupByProjectCode();
		}*/
	 
}
