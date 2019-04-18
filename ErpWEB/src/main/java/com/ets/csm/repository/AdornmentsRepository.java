package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Adornment;
import com.ets.csm.model.Adornment;

@Repository("adornmentRepository")
public interface AdornmentsRepository extends JpaRepository<Adornment, Integer>{
	
	 @Query("SELECT AD FROM Adornment AD")
	public List getAllAdornment();
	
	@Query("SELECT AD FROM Adornment AD WHERE AD.id =:id")
	public List getAllAdornmentByid(@Param ("id") Integer id);
	
	@Query("SELECT AD FROM Adornment AD WHERE AD.id =:id")
	public Adornment getallAdornmentById(@Param ("id") Integer id);
	
	@Query("SELECT AD,CK,ACT,AIT FROM Adornment AD LEFT JOIN AD.cake CK LEFT JOIN AD.adrnCat ACT LEFT JOIN AD.adrnItem AIT  WHERE AD.cake.id =:cakeId")
	public List getAllAdornmentBYCakeid(@Param ("cakeId") Integer cakeId);
	
	
	@Query("UPDATE Adornment ad set ad.adrnCat='0' where ad.id=:id")
	public void updateAdormentCustome(@Param ("id") Integer id);
	
	@Query("SELECT AD,CK,ACT,AIT FROM Adornment AD LEFT JOIN AD.cupcake CK LEFT JOIN AD.adrnCat ACT LEFT JOIN AD.adrnItem AIT  WHERE AD.cupcake.id =:cupcakeId")
	public List getAllAdornmentWithJoinBYCupCakeid(@Param ("cupcakeId") Integer cupcakeId);
	
	@Query("SELECT AD FROM Adornment AD WHERE AD.cupcake.id =:cupcakeId")
	public List getAllAdornmentBYCupCakeid(@Param ("cupcakeId") Integer cupcakeId);
	
}
