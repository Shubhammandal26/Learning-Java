package com.kodewala.intr1;

public class Driver 
{
	public static void main(String[] args) 
	{
		IBooking booking = new TrainBooking();
//		booking.autoUpgrade();
//		booking.checkStatus();
		Booking train = booking.book();
		train.displayDetails();
		
		System.out.println("---------------");
		
		Booking status = booking.checkStatus();

        if (status != null) {
            System.out.println("Current Status: " + status.getStatus());
        }

        System.out.println("----------------------");
        
        SearchResult result = booking.search();

        result.displaySearchResult();

        System.out.println("----------------------");

        // Java 8 default method
        booking.autoUpgrade();

        System.out.println("----------------------");
        
        booking.sendNotification();

        System.out.println("----------------------");

        // Java 8 static interface method
        IBooking.printTicket("D:/Tickets", "Train Ticket BK101");

        System.out.println("----------------------");

        // Cancel booking
        booking.cancelBooking();

        System.out.println("----------------------");

        System.out.println("After cancellation:");

        booking.checkStatus().displayDetails();

		
		
		
		
		
	

	}

}
