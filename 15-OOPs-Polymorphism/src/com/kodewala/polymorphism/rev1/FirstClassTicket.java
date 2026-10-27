package com.kodewala.polymorphism.rev1;

public class FirstClassTicket  extends Ticket
{
	@Override
	public void bookTicket()
	{
		System.out.println("FirstClassTicket.bookTicket()... FirstClassTicket");
	}
}
