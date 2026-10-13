package com.kodewala.constructors3;

public class BankAccount {
	double balance;
	
	public void deposit(double amount) {
		System.out.println("Deposit started");
		balance = balance + amount;
		System.out.println("Deposit completed");
		
	}
	
	public void withdraw(double amount) {
		System.out.println("Withdraw started");
		processWithdrawal(amount);
		if(amount < balance) {
			
		} else {
			System.out.println("Insufficient Balance");
		}
		System.out.println("Withdraw completed");
	}
	
	private void processWithdrawal(double amount) {
		
		System.out.println("Processing withdrawal");
		balance = balance - amount;
		System.out.println("Withdrawal processed");
	}

	public void checkBalance() {
		System.out.println("Current balance: " + balance);
	}
}
