package com.kodewala.object;


class AccountMgmt
{
	public AccountMgmt() 
	{
		System.out.println("AccountMgmt.AccountMgmt()....");
}
}
	
public class Account  extends AccountMgmt
{
	
	static {
	 System.out.println("static init block");	
	}
	
	String accountNumber;
	
	public Account(String accountNumber) 
	  {
		super();
		// call to init block --> IIB --> 2nd line
		System.out.println("Account(String accountNumber)");
		this.accountNumber = accountNumber;
	   }
	
//	instance Init Block --> this will get executed whenever object is created
	
	{
		System.out.println("Account IIB");
	}

  

}

