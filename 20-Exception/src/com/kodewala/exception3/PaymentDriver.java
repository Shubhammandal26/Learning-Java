package com.kodewala.exception3;

public class PaymentDriver {

	public static void main(String[] args) 
	{
		System.out.println("PaymentDriver.main() START");
		PaymentMgmt mgmt = new PaymentMgmt();
		mgmt.doPayment("23455675", 1200);
		
		System.out.println("PaymentDriver.main() END");

	}

}
