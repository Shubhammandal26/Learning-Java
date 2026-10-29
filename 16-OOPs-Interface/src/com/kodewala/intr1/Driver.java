package com.kodewala.intr1;

public class Driver {

	public static void main(String[] args) 
	{
		IBooking booking = new TrainBooking();
		booking.autoUpgrade();
		booking.checkStatus();

	}

}
