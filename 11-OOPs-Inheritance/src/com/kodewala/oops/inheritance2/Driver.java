package com.kodewala.oops.inheritance2;

// Disadvantage of inheritance
// 1.Tight couple
// 2. Heavy loading in the parent class
class Account
{
	public void openAccount(String userId, String email) 
	{
	System.out.println("Account.openAccount()");	
	}
} 

class SavingAccount extends Account
{
	@Override // changing the super class method's functionalities
	public void openAccount(String userId, String email) 
	{
	System.out.println("SavingAccount.openAccount()");	
	}
	
}

class SrCitAccount extends SavingAccount
{
	@Override
	public void openAccount(String userId, String email) 
	{
	System.out.println("SrCitAccount.openAccount()");	
	}
}

class PensionAccount extends SrCitAccount
{
	@Override
	public void openAccount(String userId, String email) 
	{
	System.out.println("PensionAccount.openAccount()");	
	}
}

public class Driver {

	public static void main(String[] args) {
		
		PensionAccount account = new PensionAccount();
		account.openAccount("shubham", "shubham@gmail");

	}

}
