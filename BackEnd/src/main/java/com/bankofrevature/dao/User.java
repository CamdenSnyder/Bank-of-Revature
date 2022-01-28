package com.bankofrevature.dao;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long user_id;
	private String user_first_name ;
    private String user_last_name ;
    private String user_address ;
    private String user_city;
    private String user_state;
    private String user_phone;
    private String user_email;
    private String user_dob ;
    private String user_password;
    private String user_role;
	
    
    


	public User(long user_id, String user_first_name, String user_last_name, String user_address, String user_city,
			String user_state, String user_phone, String user_email, String user_dob, String user_password,
			String user_role) {
		super();
		this.user_id = user_id;
		this.user_first_name = user_first_name;
		this.user_last_name = user_last_name;
		this.user_address = user_address;
		this.user_city = user_city;
		this.user_state = user_state;
		this.user_phone = user_phone;
		this.user_email = user_email;
		this.user_dob = user_dob;
		this.user_password = user_password;
		this.user_role = user_role;
	}



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getUser_first_name() {
		return user_first_name;
	}


	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}


	public String getUser_last_name() {
		return user_last_name;
	}


	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}


	public String getUser_address() {
		return user_address;
	}


	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}


	public String getUser_city() {
		return user_city;
	}


	public void setUser_city(String user_city) {
		this.user_city = user_city;
	}


	public String getUser_state() {
		return user_state;
	}


	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}


	public String getUser_phone() {
		return user_phone;
	}


	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}


	public String getUser_email() {
		return user_email;
	}


	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}


	public String getUser_dob() {
		return user_dob;
	}


	public void setUser_dob(String user_dob) {
		this.user_dob = user_dob;
	}


	public String getUser_password() {
		return user_password;
	}


	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}


	public String getUser_role() {
		return user_role;
	}


	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	
	
	
    
    
}
