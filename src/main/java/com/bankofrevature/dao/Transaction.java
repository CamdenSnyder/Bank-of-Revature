package com.bankofrevature.dao;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "transaction")
public class Transaction {
	
	@Id
	private int trans_id;
	private String trans_date;
	private int trans_by;
	private int trans_to;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn (name = "acc_id")
	private Account account;
	private String trans_type;
	private double amount;
	
	
	
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Transaction(int trans_id, String trans_date, int trans_by, int trans_to, Account account, String trans_type,
			double amount) {
		super();
		this.trans_id = trans_id;
		this.trans_date = trans_date;
		this.trans_by = trans_by;
		this.trans_to = trans_to;
		this.account = account;
		this.trans_type = trans_type;
		this.amount = amount;
	}




	public int getTrans_id() {
		return trans_id;
	}




	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}




	public String getTrans_date() {
		return trans_date;
	}




	public void setTrans_date(String trans_date) {
		this.trans_date = trans_date;
	}




	public int getTrans_by() {
		return trans_by;
	}




	public void setTrans_by(int trans_by) {
		this.trans_by = trans_by;
	}




	public int getTrans_to() {
		return trans_to;
	}




	public void setTrans_to(int trans_to) {
		this.trans_to = trans_to;
	}




	public Account getAccount() {
		return account;
	}




	public void setAccount(Account account) {
		this.account = account;
	}




	public String getTrans_type() {
		return trans_type;
	}




	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}




	public double getAmount() {
		return amount;
	}




	public void setAmount(double amount) {
		this.amount = amount;
	}




	
	
	
	
}
