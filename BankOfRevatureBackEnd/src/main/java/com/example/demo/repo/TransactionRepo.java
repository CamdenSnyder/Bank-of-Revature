package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dao.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction,Integer>  {
	
	 @Query(value = "SELECT * FROM transaction where trans_by= ?1 or trans_to=?1", nativeQuery = true)
	  List<Transaction> findBySendID(int sendcustomerid);
	 @Query(value = "SELECT * FROM transaction where trans_by_account= ?1 or trans_to_account= ?1", nativeQuery = true)
	  List<Transaction> findBySendAccountID(int sendaccountid);
}