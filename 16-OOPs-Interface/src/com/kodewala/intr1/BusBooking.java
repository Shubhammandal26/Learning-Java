package com.kodewala.intr1;

/*
 * This class is implementing IBooking interface and must implement all the abstract method of
 * IBooking interface.(100% contract)
 * */

public class BusBooking implements IBooking
{
	private Booking booking;

	@Override
	public Booking book() 
	{
		System.out.println("BusBooking.book()");
		booking = new Booking();

        booking.setBookingId("BUS301");
        booking.setPassengerName("Vikram Singh");
        booking.setSource("Bengaluru");
        booking.setDestination("Hyderabad");
        booking.setTicketPrice(1200);
        booking.setPaymentStatus("PAID");
        booking.setSeatNumber("B10");
        booking.setStatus("CONFIRMED");
		return booking;
	}

	@Override
	public void cancelBooking() 
	{
		if(booking != null && "CONIFIRMED".equals(booking.getStatus()))
		{	
			booking.setStatus("CANCELLED");
		System.out.println("Bus Booking cancel successfully");
		} else {
			System.out.println("No confirmed booking available");
		}
	}

	@Override
	public Booking checkStatus() {
//		Booking booking = new Booking();
//		booking.setBookingId("MMTBB256");
//		booking.setStatus("CONFIRMED");
		System.out.println("Checking bus booking status...");
		return booking;
	}

	@Override
	public SearchResult search() 
	{
		SearchResult result = new SearchResult();
		result.setTransportType("Bus");
        result.setSource("Bengaluru");
        result.setDestination("Hyderabad");
        result.setPrice(1200);
        result.setAvailableSeats(30);
		return result;
	}
	
//	void printTicket(String path, String contents)
//	{
//		IBooking.printTicket("", "");
//	}

}
