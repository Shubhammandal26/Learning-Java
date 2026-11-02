package com.kodewala.intr1;

public class FlightBooking implements IBooking 
{
	private Booking booking;

	@Override
	public Booking book() 
	{
		System.out.println("FlightBooking.book()");

        booking = new Booking();

        booking.setBookingId("FL201");
        booking.setPassengerName("Amit Kumar");
        booking.setSource("Bengaluru");
        booking.setDestination("Delhi");
        booking.setTicketPrice(5500);
        booking.setPaymentStatus("PAID");
        booking.setSeatNumber("F12");
        booking.setStatus("CONFIRMED");
		return booking;
	}

	@Override
	public void cancelBooking() 
	{
		if (booking != null && "CONFIRMED".equals(booking.getStatus())) {

            booking.setStatus("CANCELLED");

            System.out.println("Flight booking cancelled successfully.");
        } else {

            System.out.println("No confirmed booking available.");
        }
		
	}

	@Override
	public Booking checkStatus() 
	{
		System.out.println("Checking flight booking status....");
		return booking;
	}

	@Override
	public SearchResult search() 
	{
		SearchResult result = new SearchResult();

        result.setTransportType("Flight");
        result.setSource("Bengaluru");
        result.setDestination("Delhi");
        result.setPrice(5500);
        result.setAvailableSeats(10);
		return result;
	}
	
//	void printTicket(String path, String contents)
//	{
//		IBooking.printTicket("", "");
//	}

}
