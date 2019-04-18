package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Referral;
import com.ets.csm.model.User;
import com.ets.csm.repository.ReferralRepository;

@Service
public class ReferralServiceImpl implements ReferralService{
	
	@Autowired
	private ReferralRepository referralRepository;

	@Override
	public List getAllReferrals() {
		
		return referralRepository.getAllReferral();
	}

	@Override
	public List getAllReferralById(Integer id) {
		// TODO Auto-generated method stub
		return referralRepository.getAllReferralById(id);
	}

	@Override
	public void saveReferral(Referral ref) {
		referralRepository.save(ref);
		
	}

	@Override
	public void removeReferral(Referral ref) {
		referralRepository.delete(ref);
		
	}
	
	
	
	public Referral getAllReferralDataById(Integer id) {
		// TODO Auto-generated method stub
		return referralRepository.getReferralByRefID(id);
	}

	
	@Override
	public List getAllReferralDetailsByUsername(String username)
	{
		return referralRepository.getAllReferralByUserName(username);
	}
	
	@Override
	public List getAllReferralDetailsByUsernameWithNoStatusFlag(String username)
	{
		return referralRepository.getAllReferralByUserName_NoStatusFlag(username);
	}
	
	
	
	@Override
	public List getAllReferral() {
		
		return referralRepository.getAllReferral();
	}
	
	
	
	
	
}