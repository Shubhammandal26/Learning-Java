package com.kodewala.intr1;

public class TrainBooking implements IBooking {

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
		return booking;
	}

	@Override
	public void cancelBooking() {
		System.out.println("TrainBooking.cancelBooking()");
	}

	@Override
	public Booking checkStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SearchResult search() {
		// TODO Auto-generated method stub
		return null;
	}

}
