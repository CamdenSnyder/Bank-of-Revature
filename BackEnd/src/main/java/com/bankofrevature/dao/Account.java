package com.bankofrevature.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int acc_id;
	private String acc_type;
	private String opening_date;
	private int acc_balance;
	private int branch_id;
	private int user_id;
	


	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Account(int acc_id, String acc_type, String opening_date, int acc_balance, int branch_id, int user_id) {
		super();
		this.acc_id = acc_id;
		this.acc_type = acc_type;
		this.opening_date = opening_date;
		this.acc_balance = acc_balance;
		this.branch_id = branch_id;
		this.user_id = user_id;
	}



	public int getAcc_id() {
		return acc_id;
	}



	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}



	public String getAcc_type() {
		return acc_type;
	}



	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}



	public String getOpening_date() {
		return opening_date;
	}



	public void setOpening_date(String opening_date) {
		this.opening_date = opening_date;
	}



	public int getAcc_balance() {
		return acc_balance;
	}



	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}



	public int getBranch_id() {
		return branch_id;
	}



	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}



	public int getUser_id() {
		return user_id;
	}



	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	
}
