package com.kodewala.polymorphism1;

public class FirstClassTicket extends Ticket
{
	@Override
	public void doBooking()
	{
		System.out.println("FirstClassTicket.doBooking()...FirstClassTicket");
	}

}
