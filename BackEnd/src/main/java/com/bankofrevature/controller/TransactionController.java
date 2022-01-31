package com.bankofrevature.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankofrevature.dao.Account;
import com.bankofrevature.dao.Transaction;
import com.bankofrevature.repo.TransactionRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired
	private TransactionRepo tr;
	
	@Autowired
//	private RequestService requestService; // Error: "Request Service cannot be resolved to a type."
	
	@RequestMapping("/")
	@ResponseBody
	public List<Transaction> allCus()
	{
		
		return tr.findAll();
	}
	
	@RequestMapping("/Account/{acc_id}")
	@ResponseBody
	public List<Transaction> BySenderAccId(@PathVariable(name="acc_id") int acc_id)
	{
		
		return tr.findBySendAccountID(acc_id);
	}
	
	
	@RequestMapping("/Customer/{cus_id}")
	@ResponseBody
	public List<Transaction> BySendCustomerID(@PathVariable(name="cus_id") int cus_id,HttpServletRequest request)
	{
//		String clientIp = requestService.getClientIp(request);	// Error: "Request Service cannot be resolved."
//		Auth au = new Auth();
//		if(au.findAuthToken(clientIp+cus_id))
//		{
//			return  tr.findBySendCustomerID(cus_id);
//		}
//		 List<Transaction> acc = new ArrayList<Transaction>();
//		return acc ;
		return  tr.findBySendCustomerID(cus_id);
		
	}
	
	@RequestMapping("/{trans_id}")
	@ResponseBody
	public Optional<Transaction> ByID(@PathVariable(name="trans_id") int trans_id)
	{
		
		return  tr.findById(trans_id);
	}

	
	@PostMapping("/new_transaction")
	public Transaction Login( @RequestBody Transaction transaction)
	{
		transaction = tr.save(transaction);
		return transaction;
		
	}
	@PutMapping("/transaction_update")
	public Transaction Update( @RequestBody Transaction transaction)
	{
		transaction = tr.save(transaction);
		return transaction;
		
	}
}