package com.kodewala.oops;

public class FundTransfer {

	public static void main(String[] args) 
	{
		Account account = new Account("Shubham", "45612378900", 20000);
		
		account.transferAmount(-500);
		
		int balance = account.checkBalance();
		
		System.out.println("Remaining balance : " + balance);
		
		
	}

}
