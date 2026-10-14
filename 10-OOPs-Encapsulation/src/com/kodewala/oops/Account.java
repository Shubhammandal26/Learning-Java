package com.kodewala.oops;

public class Account 
{
	private String accountHolder;
	private String accountNumber;
	private  int balance;
	
	
	
	public Account(String accountHolder, String accountNumber, int balance) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	// getter
	public int checkBalance()
	{
		return balance;
	}
	
	//setter
	public void transferAmount(int _amount)
	{
		if(_amount > 0  &&  _amount <= balance) 
		{
			balance = balance - _amount;
			
		} else {
			System.out.println("Please enter valid balance");
		}
	}
   }
