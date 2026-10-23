package com.kodewala.polymorphism1;

public class BusinessClassTicket extends Ticket
{
	@Override
	public void doBooking()
	{
		System.out.println("BusinessClassTicket.doBooking()... BusinessClassTicket");
	}

}
