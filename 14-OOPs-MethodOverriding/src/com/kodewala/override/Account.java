package com.kodewala.override;

public class Account 
{
	public String openAccount(String name, int balance) 
	{
	 System.out.println("Account.openAccount()....");
	 return "open account";
	}

}

class SavingAccount extends Account
{
//	1.Method name should be same
//	2.Type, order and Number of args should be same
//	3. Return type should be same except covariant
//	4. Access modifier --> should be same or widen(public --> public, protected --> protected or public)
	@Override  // you are telling compiler that i am overriding the method. Please check all the rules.
	 public String openAccount(String _name, int _balance)
	 {
		 return "saving account";
	 }
}
