package com.kodewala.exception1;

public class Driver {

	public static void main(String[] args)
	{
	Account account = new Account();
	String accNo = "SBI_4567";
	String address[] = {"BTM Bangalore", "JP Nagar Bangalore"};
	account.doActivateAcc(accNo, address);

	}
}

class Account
{
	void doActivateAcc(String accNo, String address[])
	{
		System.out.println("Account.doActivateAcc() STARTED");
		validateAccDetails(accNo, address);
		
		System.out.println("Account.doActivateAcc() END");  // Exception Propagation 
	}
	
	boolean validateAccDetails(String accNo, String address[])
	{
		System.out.println("Account.validateAccDetails() START");
		System.out.println("Validating amount details...");
		System.out.println("Checking account status...");
		
		int accountType = 1;
		String bankName = "State Bank of India";
		boolean isActive = true;
		
		System.out.println("Account Type: " + accountType);
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Active: " + isActive);
		boolean isValid = false;
		try {
			String homeAddress = address[2];
			System.out.println("Home Address: " + homeAddress);
		 isValid = accNo.startsWith("SBI");
		 int amount = 100/0;
		 int accNoInt = Integer.parseInt(accNo);
		} catch (NullPointerException e) 
		{
			System.out.println("Values is null");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(" You are trying to get an values from invalide input");
			e.printStackTrace();
		} catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException.. number / by zero");
			e.printStackTrace();
		} catch (Exception e) 
		{
			System.out.println("Unknown error");
		}
		System.out.println("Account.validateAccDetails() END");
		return isValid;
	}
}
