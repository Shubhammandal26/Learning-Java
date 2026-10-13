package com.kodewala.controlflow;

public class Booked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking booking = new Booking();
		String pnr = booking.doBooking("BLR", "CLC", 5);
		System.out.println("PNR: " + pnr);
	}

}
