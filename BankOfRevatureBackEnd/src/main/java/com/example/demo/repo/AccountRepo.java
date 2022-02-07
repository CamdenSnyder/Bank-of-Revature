package com.example.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dao.Account;

public interface AccountRepo extends JpaRepository<Account,Integer> {
	 @Query(value = "SELECT * FROM account where user_id = ?1", nativeQuery = true)
	  List<Account> findByUserID(int customerid);
	 
	 @Query(value = "SELECT user_id FROM account where acc_id = ?1", nativeQuery = true)
	  int findUserbyaccID(int accid);
	 
	 @Transactional
	  @Modifying
	  @Query(value ="UPDATE account SET acc_balance=acc_balance+?2 WHERE acc_id= ?1", nativeQuery = true)
	  int depositBalance(int acc_id,double trans_amount);
	 
	 @Transactional
	  @Modifying
	  @Query(value ="UPDATE account SET acc_balance=acc_balance-?2 WHERE acc_id= ?1", nativeQuery = true)
	  int withBalance(int acc_id,double trans_amount);
}
