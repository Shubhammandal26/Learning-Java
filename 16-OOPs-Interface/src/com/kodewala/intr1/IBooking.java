package com.kodewala.intr1;

public interface IBooking 
{
//	what to do?
	public abstract Booking book();
	public abstract void cancelBooking();
	public abstract Booking checkStatus();
	SearchResult search();
	
	// optional -- 2020
//	Java 8: Default method
	public default void autoUpgrade() // to some of the classes
	{
//		500 lines(checking status, connecting with database(25 lines), upgrading)
		
		connecttoDB();
		System.out.println("IBooking.autoUpgrade()");
	}
	
//	optional 
//	Java 8: Default method
	public default void sendNotification()  // to some of the classes
	{
//		200 lines(connecting with database(25 lines)), get user details and send notification 
		connecttoDB();
		System.out.println("IBooking.sendNotification().......");
	}
	
//	Java 9: Private interface method
	private void connecttoDB()
	{
		System.out.println("IBooking.connecttoDB()");
	}
	
//	common or utility method
//	Java 8: static method
	public static void printTicket(String path, String contents) 
	{
	System.out.println("Printing ticket... static method...");
	System.out.println("Path: " + path);
	System.out.println("Contents: " + contents);
	}

}
