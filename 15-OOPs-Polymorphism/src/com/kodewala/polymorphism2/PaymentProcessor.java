package com.kodewala.polymorphism2;

public class PaymentProcessor 
{
	public void processPayment(Payment payment)  // can accept any type of Payment(CreditCard, DebitCard etc) object
	{
	//	Payment payment = new NetBankingPayment();
		payment.doPayment(); // Polymorphism
	}

}
