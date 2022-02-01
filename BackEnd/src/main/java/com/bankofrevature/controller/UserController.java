package com.bankofrevature.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankofrevature.dao.LogIn;
import com.bankofrevature.dao.User;
import com.bankofrevature.repo.UserRepo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserRepo cr;
	
	//@Autowired
	//private RequestService requestService;
	
	@RequestMapping("/")
	@ResponseBody
	public List<User> allCus()
	{
		
		return cr.findAll();
	}
	
	@RequestMapping("/profile/{user_id}")
	@ResponseBody
	public Optional<User> ById(@PathVariable(name="user_id") Long user_id)
	{
		
		return cr.findById(user_id);
	}
	
	@PostMapping("/login")
	public String Login( @RequestBody LogIn login)
	{		

		String user_id= cr.findByEmailAddressAndPass(login.getEmail(),login.getPass());
		return user_id;
		
	}
	@PostMapping("/new_user")
	public boolean New( @RequestBody User user)
	{
		 cr.saveuserdata(user.getUser_address(), user.getUser_city(),user.getUser_dob(),user.getUser_email(),user.getUser_first_name(),user.getUser_last_name(),user.getUser_password(),user.getUser_phone(),user.getUser_role(),user.getUser_state(),user.getUser_id());;
		return true;
		
	}
	
	@PutMapping("/profile_update/{user_id}")
	public User Update( @RequestBody User user,@PathVariable(name="user_id") int user_id)
	{
		
		//user= cr.saveuserdata(user.getUser_address(), user.getUser_city(),user.getUser_dob(),user.getUser_email(),user.getUser_first_name(),user.getUser_last_name(),user.getUser_password(),user.getUser_phone(),user.getUser_role(),user.getUser_state(),user.getUser_id());
		return user;
		
	}
	
	
}
