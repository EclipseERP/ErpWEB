package com.ets.csm.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.User;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	 User findByEmail(String email);
   @Query("SELECT U.firstName, U.lastName,U.email, U.phone,U.country, U.active,U.userName FROM User U WHERE U.email!='admin'")
   public List getAllUser();
   
   @Query("SELECT U FROM User U WHERE U.email =:email")
   public List getUserDataByID(@Param ("email") String email);
   
   @Query("SELECT U.email FROM User U")
   public List getUserName();
   
   @Query("SELECT U FROM User U WHERE U.userName =:userName")
   public User getUserByUserName(@Param ("userName") String userName);
   
   @Query("SELECT U.thid FROM User U WHERE U.userName =:userName")
   public List getCurrentUserTheme(@Param ("userName") String userName);
   
   @Query("SELECT U.firstName, U.lastName,U.email, U.phone,U.country, U.active,U.userName FROM User U WHERE U.active=1")
   public List getActiveUser();
   
   @Query("SELECT U.firstName, U.lastName,U.email, U.phone,U.country, U.active,U.userName FROM User U WHERE U.active=0")
   public List getInactiveUser();
   
   @Query("SELECT U.firstName, U.lastName,U.email, U.phone,U.country, U.active,U.userName,R.role, U.cupCake, U.version, U.emailFac,U.paymentPendingStatus,U.address,U.city,U.id FROM User U JOIN U.roles R WHERE R.role!='ROLE_ADMIN' order by U.id DESC")
   public List getUserByRole();
   
   
/*   @Query("SELECT U FROM User U  WHERE U.id =: id")
   public List<User> getUserbyId(@Param ("id") Long id);*/
   
   @Query("SELECT U FROM User U WHERE U.email =:email AND U.password=:password")
   public List getUserDataByIDAndPassword(@Param ("email") String email,@Param ("password") String password);
   
   @Query("SELECT U FROM User U WHERE U.email=:email")
   public List getUserDataByEmail(@Param ("email") String email);
   
   @Query("SELECT U FROM User U WHERE U.email=:email And U.active=1")
   public List getUserDataByEmailByActive(@Param ("email") String email);
  
   @Transactional
   @Modifying
   @Query("UPDATE User U SET U.userName =:userName , U.email=:email WHERE U.id=:id")
   public void updateUser(@Param ("userName") String username,@Param ("email") String email,@Param ("id") long id);
   
   @Query("SELECT U FROM User U WHERE U.id=:id")
   public User getUserDataByRowId(@Param ("id") long id);
   
   
   
}
