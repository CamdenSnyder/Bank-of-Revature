package com.example.demo.controller;

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

import com.example.demo.dao.Account;
import com.example.demo.repo.AccountRepo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountRepo ar;
	
	
	@RequestMapping("/")
	@ResponseBody
	public List<Account> allCus()
	{
		
		return ar.findAll();
	}
	
	@RequestMapping("/{acc_id}")
	@ResponseBody
	public Optional<Account> ById(@PathVariable(name="acc_id") int acc_id)
	{
		
		return ar.findById(acc_id);
	}
	
	@RequestMapping("/accountByCustomer/{cus_id}")
	@ResponseBody
	public List<Account> ByCustomerID(@PathVariable(name="cus_id") int cus_id,HttpServletRequest request)
	{
		
		return  ar.findByUserID(cus_id);

	}
	
	
	@PostMapping("/create_new_account")
	public boolean Login( @RequestBody Account account)
	{
		account = ar.save(account);
		return true;
		
	}
	@PutMapping("/account_update/{cus_id}")
	public Account Update( @RequestBody Account account, @PathVariable(name="cus_id") int cus_id,HttpServletRequest request)
	{
		
			account = ar.save(account);
			return account;
		
		
	}
	@PutMapping("/account_update_balance/{acc_id}/{trans_amount}/{type}")
	public double updateBalance(@PathVariable(name="acc_id") int acc_id,@PathVariable(name="trans_amount") double trans_amount,@PathVariable(name="type") String type)
	{		
			System.out.print(type);
			if(type.equals("deposit"))
			{
				return ar.depositBalance(acc_id, trans_amount);
			}
			
			else if(type.equals("withdraw"))
			{
				return ar.withBalance(acc_id, trans_amount);
			}
						
			else
			{
				return -1;
			}
		
	}

}
