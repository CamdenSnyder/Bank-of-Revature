<<<<<<< HEAD
package com.bankofrevature.dao;

import javax.persistence.CascadeType;
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
@Table (name = "transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int trans_id;
	private String trans_date;
	private int trans_by;
	private int trans_to;
	private int account_id;
	private String trans_type;
	private double amount;
	
	
	
	
	public Transaction(int trans_id, String trans_date, int trans_by, int trans_to, int account_id, String trans_type,
			double amount) {
		super();
		this.trans_id = trans_id;
		this.trans_date = trans_date;
		this.trans_by = trans_by;
		this.trans_to = trans_to;
		this.account_id = account_id;
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






	public int getAccount_id() {
		return account_id;
	}






	public void setAccount_id(int account_id) {
		this.account_id = account_id;
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






	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	



}
=======
package com.bankofrevature.dao;

import javax.persistence.CascadeType;
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
@Table (name = "transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int trans_id;
	private String trans_date;
	private int trans_by;
	private int trans_to;
	private int account_id;
	private String trans_type;
	private double amount;
	
	
	
	
	public Transaction(int trans_id, String trans_date, int trans_by, int trans_to, int account_id, String trans_type,
			double amount) {
		super();
		this.trans_id = trans_id;
		this.trans_date = trans_date;
		this.trans_by = trans_by;
		this.trans_to = trans_to;
		this.account_id = account_id;
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






	public int getAccount_id() {
		return account_id;
	}






	public void setAccount_id(int account_id) {
		this.account_id = account_id;
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






	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	



}
>>>>>>> 60a8e78babacd6f78192fb69750c948a891d2c6c
