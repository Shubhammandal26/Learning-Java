package com.kodewala.oops;

public class Payment 
{ 
//	public int balance ; // other class can change this variable w/o your(Payment) class permission
	private int balance;  // Data or variable

	public Payment(int balance) {
		super();
		this.balance = balance;
	}
	
	public void doCredit(int _amount)
	{
		// Modifying the data
	 balance = balance + _amount;	
	}
	
	// setter
	public void doDebit(int _amount) 
	{
		if(_amount > 0) {
		// Modifying the data
	 balance = balance - _amount;	
	}
	}
	
	public int getBalance()
	{
		return balance;
	}

}
