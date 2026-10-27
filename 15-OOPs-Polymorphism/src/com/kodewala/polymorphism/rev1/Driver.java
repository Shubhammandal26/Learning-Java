package com.kodewala.polymorphism.rev1;

public class Driver {

	public static void main(String[] args) 
	{
		TicketBookingProcess booking = new TicketBookingProcess();
		
		booking.processTicketBooking(new BusinessClassTicket());
		
		booking.processTicketBooking(new FirstClassTicket());
		
		booking.processTicketBooking(new PremiumEconomyTicket());
	}

}
