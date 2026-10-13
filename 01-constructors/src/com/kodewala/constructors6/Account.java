package com.kodewala.constructors6;

/**
 * Bank is a parent class that contains information like bankHolderName, bankName, and branch
 */

public class Account extends Bank 
{
	int balance;
	String accountNumber;
	

	public Account(String _bankHolderName, String _bankName, String _branch, int _balance,String _accountNumber) {
		super(_bankHolderName, _bankName, _branch);
		this.balance = _balance;
		this.accountNumber = _accountNumber;
	}

}
