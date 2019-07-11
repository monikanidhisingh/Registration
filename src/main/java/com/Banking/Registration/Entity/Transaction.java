package com.Banking.Registration.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="/transaction")
public class Transaction {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	
	@Column(name="acc_no")
	private long accountNumber;
	
	@Column(name="acc_bal")
	private long accountBalance;
		
	@Column(name="user_name")
	private String userName;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getDebit_amount() {
		return debit_amount;
	}

	public void setDebit_amount(long debit_amount) {
		this.debit_amount = debit_amount;
	}

	public long getCredit_amount() {
		return credit_amount;
	}

	public void setCredit_amount(long credit_amount) {
		this.credit_amount = credit_amount;
	}

	@Column(name="debit_amount")
	private long debit_amount;
	
	@Column(name="credit_account")
	private long credit_amount;
	
	
	
}
