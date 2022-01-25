package com.bankofrevature.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "account")
public class Account {

	@Id
	private int acc_id;
	private String acc_type;
	private String opening_date;
	private int acc_balance;
	private int branch_id;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	@OneToMany (mappedBy = "account")
	private List<Transaction> transactions;
	
	
	
	
	



	public Account(int acc_id, String acc_type, String opening_date, int acc_balance, int branch_id, User user,
			List<Transaction> transactions) {
		super();
		this.acc_id = acc_id;
		this.acc_type = acc_type;
		this.opening_date = opening_date;
		this.acc_balance = acc_balance;
		this.branch_id = branch_id;
		this.user = user;
		this.transactions = transactions;
	}



	public Account() {
		super();
		// TODO Auto-generated constructor stub
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



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public List<Transaction> getTransactions() {
		return transactions;
	}



	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	
	
	
	
}
