package com.ets.csm.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ets.csm.model.AppointmentEvent;

@Repository("appointmentEventRepository")
public interface AppointmentEventRepository extends JpaRepository<AppointmentEvent, Integer>{

	@Query("SELECT AE FROM AppointmentEvent AE")
	public List getAllAppoinEvent();
	
	@Query("SELECT AE FROM AppointmentEvent AE WHERE AE.id =:id")
	public List getAllAppoinEventBYid(@Param ("id") Integer id);
	
	@Query("SELECT AE FROM AppointmentEvent AE WHERE AE.user.userName =:userName order by AE.id desc")
	public List getAllAppoinEventBYUserid(@Param ("userName") String userName);
	
	
}
