package com.kodewala.oops;

public class Driver {

	public static void main(String[] args) 
	{
		Payment payment = new Payment(1000);
		
		payment.doCredit(200);
		System.out.println(payment.getBalance());
		
		payment.doDebit(500);
		System.out.println(payment.getBalance());
		
	}

}
