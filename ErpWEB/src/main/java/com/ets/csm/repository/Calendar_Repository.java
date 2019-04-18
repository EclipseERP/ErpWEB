package com.ets.csm.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Calender;

@Repository("Calendar_Repository")
public interface Calendar_Repository extends JpaRepository<Calender, Integer>{
	
//	SELECT MU,MCU FROM MaterialsUser MU JOIN MU.category MCU WHERE MU.user.userName =:userName
	
	@Query("SELECT CC,US FROM Calender CC JOIN CC.user US where CC.user.userName=:userName order by CC.id")
	public List getAllAppontmentByUserId(@Param ("userName") String userName);
	
	@Query("SELECT CC,US FROM Calender CC JOIN CC.user US where CC.user.userName=:userName and CC.cancel_apoint='1' or CC.rescdule_appoint='1' order by CC.id")
	public List getAllAppontmentByUserName_CancelledOrRescheduled(@Param ("userName") String userName);
	
	@Query("SELECT C FROM Calender C WHERE C.id =:id")
	public List getAllAppontmentById(@Param ("id") Integer id);

	@Query("SELECT COUNT(*) FROM Calender C WHERE C.user.userName =:userName")
	public int totalAppointments(@Param ("userName") String userName);
}
