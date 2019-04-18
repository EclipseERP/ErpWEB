package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.OrderManage;

@Repository ("orderManageRepository")
public interface OrderManageRepository extends JpaRepository<OrderManage, Integer>{
	
	
	@Query("SELECT ODM FROM OrderManage ODM WHERE ODM.orderStatus=1")
	public List getAllOrderManage();
	
	@Query("SELECT ODM,CUS,EV,VN FROM OrderManage ODM LEFT JOIN ODM.customer CUS LEFT JOIN ODM.events EV LEFT JOIN ODM.venue VN WHERE ODM.id =:id AND ODM.orderStatus=1")
	public List getAllOrderManageByid(@Param ("id") Integer id);
	
	@Query("SELECT ODM FROM OrderManage ODM WHERE ODM.id =:id")
	public OrderManage getallOrderManageById(@Param ("id") Integer id);
	
	@Query("SELECT ODM,CUS,EV,VN,CK FROM OrderManage ODM LEFT JOIN ODM.customer CUS LEFT JOIN ODM.events EV LEFT JOIN ODM.venue VN LEFT JOIN ODM.cake CK WHERE ODM.user.userName =:userName AND ODM.orderStatus=1")
	public List getAllOrderManageBYUserid(@Param ("userName") String userName);
	
	@Query("SELECT ODM,CUS,EV,VN,CK FROM OrderManage ODM LEFT JOIN ODM.customer CUS LEFT JOIN ODM.events EV LEFT JOIN ODM.venue VN LEFT JOIN ODM.cake CK WHERE ODM.user.userName =:userName AND ODM.orderStatus=0")
	public List getQutoUser(@Param ("userName") String userName);
	
	@Query("SELECT ODM FROM OrderManage ODM WHERE  ODM.id=(SELECT max(ODM.id) FROM OrderManage ODM)")
	public OrderManage getOrderManageByMaxid();
		
	@Query("SELECT ODM,CUS,EV,VN FROM OrderManage ODM LEFT JOIN ODM.customer CUS LEFT JOIN ODM.events EV LEFT JOIN ODM.venue VN WHERE ODM.user.userName =:userName and ODM.paymentOccurrence<>'0'")
	public List getAllOrderManageBYUserid_And_paymentStatus(@Param ("userName") String userName);

	@Query("SELECT ODM,CUS,EV,VN,CK FROM OrderManage ODM LEFT JOIN ODM.customer CUS LEFT JOIN ODM.events EV LEFT JOIN ODM.venue VN LEFT JOIN ODM.cake CK WHERE ODM.user.userName =:userName AND ODM.orderStatus=1")
	public List getAllCupCakeOrderManageBYUserid(@Param ("userName") String userName);
	
	@Query("SELECT COUNT(*) FROM OrderManage ODM WHERE ODM.user.userName =:userName")
	public int totalOrders(@Param ("userName") String userName);


}
