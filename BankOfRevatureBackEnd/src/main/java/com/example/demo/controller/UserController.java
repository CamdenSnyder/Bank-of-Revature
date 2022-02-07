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

import com.example.demo.dao.LogIn;
import com.example.demo.dao.Password;
import com.example.demo.dao.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.services.mail.ResetPasswordEmail;

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
	public Optional<User> ById(@PathVariable(name="user_id") int user_id)
	{
		
		return cr.findById(user_id);
	}
	
	@PostMapping("/login")
	public int Login( @RequestBody LogIn login)
	{		

		//String user_id= cr.findByEmailAddressAndPass(login.getEmail(),login.getPass());
		return cr.findByEmailAddressAndPass(login.getEmail(),login.getPass());
		
	}
	@PostMapping("/new_user")
	public boolean New( @RequestBody User user)
	{
		cr.save(user);
		return true;
		
	}
	
	@PutMapping("/profile_update/{user_id}")
	public boolean Update( @RequestBody User user,@PathVariable(name="user_id") int user_id)
	{
		
		cr.save(user);
		return true;
		
	}
	@PutMapping("/password_update/{cus_id}")
	public String passwordUpdate( @RequestBody Password password,@PathVariable(name="cus_id") int cus_id,HttpServletRequest request)
	{
		
		String new_pass=password.getPassword();
		System.out.print("--------------------------------- Pass "+new_pass+" ====================");
		cr.updatePass(cus_id,new_pass);
		
		System.out.print("---------------------------------Q====================");
		return "1";
		
	}
	@RequestMapping("/send_email/password_update/{cus_email}")
	public boolean sendEmail( @PathVariable(name="cus_email") String cus_email,HttpServletRequest request)
	{

		String cus_id= cr.findByEmailAddress(cus_email);
		if(cus_id==null)
		{
			return false;
		}
		ResetPasswordEmail rpe = new ResetPasswordEmail();
		if(rpe.SendMailForRestPassword(cus_email,cus_id))
		return true;
		else
			return false;
		
	}
}
