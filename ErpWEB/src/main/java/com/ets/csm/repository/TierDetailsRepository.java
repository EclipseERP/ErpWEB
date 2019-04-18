package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.TierDetails;

@Repository("tierdetailsrepository")
public interface TierDetailsRepository extends JpaRepository<TierDetails, Integer>{
	
	@Query("SELECT TD FROM TierDetails TD")
	public List getAllTierDetails();
	
	@Query("SELECT TD FROM TierDetails TD WHERE TD.id =:id")
	public List getAllTierDetailsByid(@Param ("id") Integer id);
	
	@Query("SELECT TD FROM TierDetails TD WHERE TD.id =:id")
	public TierDetails getallTierDetailsById(@Param ("id") Integer id);
	
	@Query("SELECT TD,CP FROM TierDetails TD LEFT JOIN TD.cakepan CP WHERE TD.cake.id =:id")
	public List getTierDetailsByCake(@Param ("id") Integer id);
	
	/*@Query("SELECT TD FROM TierDetails TD WHERE TD.user.userName =:userName")
	public List getAllTierDetailsByUsername(@Param ("userName") String userName);
	 */
	
	@Query("SELECT TD,CP,IC FROM TierDetails TD LEFT JOIN TD.cakepan CP LEFT JOIN TD.icingUser IC WHERE TD.cake.id =:id")
	public List getTierDetailsPriceByCake(@Param ("id") Integer id);

}
