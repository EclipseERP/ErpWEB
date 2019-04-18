package com.ets.csm.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ets.csm.model.FillingRecipeMaster;

@Repository("fillingRecipeMasRepository")
public interface FillingRecipeMasterRepository extends JpaRepository<FillingRecipeMaster, Integer>{
	
	@Query("SELECT RM FROM FillingRecipeMaster RM")
	public List getFillingRecipeMaster();
	
	@Query("SELECT RM FROM FillingRecipeMaster RM WHERE RM.id =:id")
	public List getFillingRecipeMasterByid(@Param ("id") Integer id);
	
	@Query("SELECT RM FROM FillingRecipeMaster RM WHERE RM.id =:id")
	public FillingRecipeMaster getFillingRecipe(@Param ("id") Integer id);
	
	@Query("SELECT RM FROM FillingRecipeMaster RM WHERE  RM.id=(SELECT max(RM.id) FROM FillingRecipeMaster RM)")
	public List getFillingRecipeByMaxid();
	

}
