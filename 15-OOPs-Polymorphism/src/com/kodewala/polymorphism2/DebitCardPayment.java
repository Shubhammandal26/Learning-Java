package com.kodewala.polymorphism2;

public class DebitCardPayment extends Payment
{
	@Override
	public void doPayment()
	{
		System.out.println("DebitCardPayment.doPayment()....DebitCardPayment");
	}

}
