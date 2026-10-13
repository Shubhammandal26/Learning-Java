package com.kodewala.constructors4;

public class Customer extends Bank 
{
	String customerName;
	String accountNumber;
	String bankBranch;
	int balance;
	
	  Customer(String _bankName,String _customerName, String _accountNumber, String _bankBranch, int _balance) 
	 {
		  super(_bankName);
		 this.customerName = _customerName;
		 this.accountNumber = _accountNumber;
		 this.bankBranch = _bankBranch;
		 this.balance = _balance;
		 System.out.println("Bank name is: " + bankName + " customer name is " + customerName + " , account number is: "
				   + accountNumber + " bank branch is: " + bankBranch + " with bank balance is " + balance);
	 
	}

	public static void main(String[] args) {
		
		
	Customer customer = new Customer("SBI", "shubham", "4523101148", "BTM Layout 2nd stage", 250000);

	}

}
