package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Transaction;
import com.example.demo.repo.AccountRepo;
import com.example.demo.repo.TransactionRepo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired
	private TransactionRepo tr;
	
	@Autowired
	private AccountRepo ar;
	
	
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
		return  tr.findBySendID(cus_id);
		
	}
	
	@RequestMapping("/{trans_id}")
	@ResponseBody
	public Optional<Transaction> ByID(@PathVariable(name="trans_id") int trans_id)
	{
		
		return  tr.findById(trans_id);
	}

	
	@PostMapping("/new_transaction")
	public boolean newTransaction( @RequestBody Transaction transaction)
	{
		String type=transaction.getTrans_type();
		int acc_id=transaction.getAccount_id();
		double trans_amount= transaction.getAmount();
		transaction.setTrans_by(ar.findUserbyaccID(acc_id));
		int done=0;
		if(type.equals("deposit"))
		{
			done=ar.depositBalance(acc_id, trans_amount);
		}
		
		else if(type.equals("withdraw"))
		{
			done= ar.withBalance(acc_id, trans_amount);
		}
					
		else
		{
			done= -1;
		}
		if(done==1)
		{
			transaction = tr.save(transaction);
			return true;
		}
		else {
			return false;
		}

		
	}
//	@PutMapping("/transaction_update")
//	public Transaction Update( @RequestBody Transaction transaction)
//	{
//		
//	}
}
