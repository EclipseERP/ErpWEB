package com.ets.csm.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ets.csm.model.Accounts;
import com.ets.csm.model.RawMaterials;

public interface AccountsRepository extends JpaRepository<Accounts, Integer>{
/*	@Query("SELECT P FROM Projects P WHERE P.project_code =:project_code")
	public List getProjectForTurnoverPageGroupByProjectCode(@Param ("project_code") String project_code);*/

	/*@Query("SELECT P FROM Projects P WHERE P.project_code =:project_code")
	public List getProjectForTurnoverPageGroupByProjectCode(@Param ("id") Integer id);*/
}
