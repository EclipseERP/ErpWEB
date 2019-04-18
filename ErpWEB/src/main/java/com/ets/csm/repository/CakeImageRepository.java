package com.ets.csm.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ets.csm.model.CakeImage;

@Repository("cakeImageRepository")
public interface CakeImageRepository extends JpaRepository<CakeImage, Integer>{

	@Query("SELECT CK FROM CakeImage CK WHERE CK.id =:id")
	public List getAllCakeImageBYid(@Param ("id") Integer id);
	
	@Query("SELECT CK FROM CakeImage CK WHERE CK.id =:id")
	public CakeImage getallCakeImageById(@Param ("id") Integer id);
	
	@Query("SELECT CK FROM CakeImage CK WHERE CK.cake.id =:cakeId")
	public List getCakeImageCake(@Param ("cakeId") Integer cakeId);
	
}
