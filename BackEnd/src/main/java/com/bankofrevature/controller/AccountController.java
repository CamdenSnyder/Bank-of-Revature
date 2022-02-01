package com.bankofrevature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankofrevature.dao.Account;
import com.bankofrevature.repo.AccountRepo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountRepo ar;
	
	

	@PostMapping("/create_new_account")
	public Account Login( @RequestBody Account account)
	{
		account = ar.save(account);
		return account;
		
	}

}
