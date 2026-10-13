package com.kodewala.constructors3;

public class BankAccountDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount();
		
		account.deposit(5000);
		account.withdraw(1500);
		account.checkBalance();
		System.out.println("Program completed");

	}

}
