package com.kodewala.intr1;

public interface IBooking 
{
	public abstract Booking book();
	public abstract void cancelBooking();
	public abstract Booking checkStatus();
	SearchResult search();
	
	// optional -- 2020
	public default void autoUpgrade() // to some of the classes
	{
		System.out.println("IBooking.autoUpgrade()");
	}

}
