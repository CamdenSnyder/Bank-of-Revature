package com.example.demo.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dao.User;

public interface UserRepo extends JpaRepository<User,Integer> {
	 @Query(value ="select user_id from public.uuser where user_email = ?1", nativeQuery = true)
	  String findByEmailAddress(String emailAddress);
	 
	 @Query(value ="select user_role from public.uuser where user_id = ?1", nativeQuery = true)
	  String findUserRole(int user_id);

	 
	  @Transactional
	  @Modifying
	  @Query(value = "UPDATE public.uuser SET user_password= ?2 WHERE user_id= ?1", nativeQuery = true)
	  int updatePass(int user_id,String pass);
	  

	
	  @Query(value = "select user_id from public.uuser where user_email = ?1 and user_password= ?2", nativeQuery = true )
	  int findByEmailAddressAndPass(String emailAddress,String pass);
}
