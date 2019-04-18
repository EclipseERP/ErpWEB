package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Cake;

@Repository ("cakeRepository")
public interface CakeRepository extends JpaRepository<Cake, Integer>{

	@Query("SELECT CK FROM Cake CK")
	public List getAllCake();
	
	@Query("SELECT CK FROM Cake CK WHERE CK.id =:id")
	public List getAllCakeByid(@Param ("id") Integer id);
	
	@Query("SELECT CK,CUS,EV,VN FROM Cake CK LEFT JOIN CK.customer CUS LEFT JOIN CK.events EV LEFT JOIN CK.venue VN WHERE CK.predefined =:predef AND CK.user.userName =:userName AND CK.cakeType =:caketype")
	public List getAllPredefinedCakesbyUserName(@Param ("userName") String userName,@Param ("predef") Integer predef,@Param ("caketype") Integer caketype);
	
	@Query("SELECT CK FROM Cake CK WHERE CK.id =:id")
	public Cake getallCakeById(@Param ("id") Integer id);
	
	@Query("SELECT CK,CUS,EV,VN FROM Cake CK LEFT JOIN CK.customer CUS LEFT JOIN CK.events EV LEFT JOIN CK.venue VN  WHERE CK.user.userName =:userName")
	public List getAllCakeBYUserid(@Param ("userName") String userName);
	
	@Query("SELECT CK,CUS,EV,VN FROM Cake CK LEFT JOIN CK.customer CUS LEFT JOIN CK.events EV LEFT JOIN CK.venue VN  WHERE CK.user.userName =:userName AND CK.cakeType =:caketype")
	public List getAllCakeBYType(@Param ("userName") String userName,@Param ("caketype") Integer caketype);
	
	@Query("SELECT CK FROM Cake CK WHERE  CK.id=(SELECT max(CK.id) FROM Cake CK)")
	public Cake getCakeByMaxid();

	@Query("SELECT T.servingCount,T.layers,CP.cupsOfBatter,CP.cupsOfFilling,CP.cupsOfIcing,CP.poundsOfFondant,CP.partyCakeserving,IC.pricePerServing,T.id FROM TierDetails T LEFT JOIN T.cake CK LEFT JOIN T.cakepan CP LEFT JOIN T.icingUser IC WHERE CK.id =:id")
	public List getTierPrice(@Param ("id") Integer id);
	
	@Query("SELECT L.id,R.pricePerServing,F.purchasePrice,F.purchaseQuantity FROM LayerDetails L LEFT JOIN L.fillingsUser F LEFT JOIN L.recipeUser R LEFT JOIN L.tierDetails T WHERE T.id =:id")
	public List getLayerPrice(@Param ("id") Integer id);
	

	/*@Query("SELECT CK,CUS,EV,VN FROM Cake CK LEFT JOIN CK.customer CUS LEFT JOIN CK.events EV LEFT JOIN CK.venue VN WHERE CK.predefined =:predef AND CK.user.userName =:userName AND CK.cakeType =:caketype")
	public List getAllPredefinedCakesbyUserName(@Param ("userName") String userName,@Param ("predef") Integer predef,@Param ("predef") Integer predef);
	
	@Query("SELECT CK,CUS,EV,VN FROM Cake CK LEFT JOIN CK.customer CUS LEFT JOIN CK.events EV LEFT JOIN CK.venue VN WHERE CK.predefined =:predef AND CK.user.userName =:userName AND CK.cakeType =:")
	public List getAllPredefinedCakesbyUserName(@Param ("userName") String userName,@Param ("predef") Integer predef, );*/
	
}
