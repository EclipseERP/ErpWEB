package com.ets.csm.service;


import java.util.List;

import com.ets.csm.model.Referral;

public interface ReferralService {
	
	public List getAllReferrals();
	
	public List getAllReferralById(Integer id);
	
	public void saveReferral(Referral referral);
	
	public void removeReferral(Referral referral);
	
	public Referral getAllReferralDataById(Integer id);
	public List getAllReferralDetailsByUsername(String username);
	public List getAllReferralDetailsByUsernameWithNoStatusFlag(String username);
	public List getAllReferral();

}
