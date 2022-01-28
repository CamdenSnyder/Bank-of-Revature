package com.bankofrevature.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bankofrevature.dao.User;

public interface UserRepo extends JpaRepository<User,Long> {
	
	
	
	  @Query(value = "select user_id from public.user where user_email = ?1 and user_password= ?2", nativeQuery = true )
	  String findByEmailAddressAndPass(String emailAddress,String pass);
	  
	  @Query(value = " insert   into   public.user        (user_address, user_city, user_dob, user_email, user_first_name, user_last_name, user_password, user_phone, user_role, user_state, user_id)    values       (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11)", nativeQuery = true )
	  void saveuserdata(String user_address,String user_city,String user_dob,String user_email,String user_first_name,String user_last_name,String user_password,String user_phone,String user_role,String user_state,long user_id);
	  
	  
}
