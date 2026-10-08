package com.kodewala.constructors6;

public class BankAccount {

	public static void main(String[] args) 
	{
		Account account = new Account("shubham", "Bank Of India", "Hata", 300000, "452610118301");
		System.out.println(account.bankHolderName);
		System.out.println(account.bankName);
		System.out.println(account.branch);
		System.out.println(account.balance);
		System.out.println(account.accountNumber);
		
	  System.out.println("------------------");
	  
		Account account1 = new Account("amit", "State Bank Of India", "Hata", 250000, "642510118301");
		System.out.println(account1.bankHolderName);
		System.out.println(account1.bankName);
		System.out.println(account1.branch);
		System.out.println(account1.balance);
		System.out.println(account1.accountNumber);
	}

}
