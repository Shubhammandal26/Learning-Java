package com.kodewala.intr1;

public class TrainBooking implements IBooking 
{
   private Booking booking;
	@Override
	public Booking book() {
		System.out.println("TrainBooking.book()");
		Booking booking = new Booking();
		
		booking.setBookingId("BK101");
		booking.setPassengerName("Rahul Sharma");
		booking.setSource("Bengaluru");
		booking.setDestination("Chennai");
		booking.setTicketPrice(1500.00);
		booking.setPaymentStatus("PAID");
		booking.setSeatNumber("A12");
		booking.setStatus("CONFIRMED");
		return booking;
	}

	@Override
	public void cancelBooking() 
	{
		if(booking != null && "CONFIRMED".equals(booking.getStatus())) 
		{
		  booking.setStatus("CANCELLED");	
		System.out.println("TrainBooking cancelled sucessfully.");
		} else {
			System.out.println("No confirmed booking available.");
		}
	}

	@Override
	public Booking checkStatus() {
		System.out.println("Checking train booking status...");
		return booking;
	}

	@Override
	public SearchResult search() 
	{
		SearchResult result = new SearchResult();
		result.setTransportType("Train");
		result.setSource("Bengaluru");
		result.setDestination("Chennai");
		result.setPrice(1500);
		result.setAvailableSeats(25);
		return result;
	}
	
//	void printTicket(String path, String contents)
//	{
//		IBooking.printTicket("", "");
//	}

}
