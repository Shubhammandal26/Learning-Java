package com.kodewala.oops1;

public class Amount 
{
	private int balance;
	
//	this method will modify the balance
   public void credit()
   {
//	   check the balance
	   checkBalance();
//	   check the pin of setter
	   validatePin("tght43");
//	   debit the amount
//	   credit the amount --> 0 --> 100
	   System.out.println("Amount.credit()... doing fund transfer...");
   }
   
   private int checkBalance()
   {
	   System.out.println("Amount.checkBalance()");
	   return 2000;
   }
   
   private boolean validatePin(String userId)
   {
	   System.out.println("Amount.validatePin()");
	   return true;
   }

}
