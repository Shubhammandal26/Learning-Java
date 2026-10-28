package com.kodewala.intr;

public class Driver {

	public static void main(String[] args) 
	{
	/*	FlightBooking flight = new FlightBooking();
		System.out.println("Flight ticket after discount: " + flight.calculateDiscount(5500, 10));
		flight.calculateDiscountTax(200); */
		
		IDiscount discount = new FlightBooking();
		System.out.println("Flight ticket: " + discount.calculateDiscount(6000, 10));
		discount.calculateDiscountTax(20);
		
		FlightBooking fb = (FlightBooking) discount;
		fb.calculateDiscount(4500, 10);

	}

}
