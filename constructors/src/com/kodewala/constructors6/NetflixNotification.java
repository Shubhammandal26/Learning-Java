package com.kodewala.constructors6;

public class NetflixNotification {

	public static void main(String[] args) 
	{
		
		Notification notification = new Notification("7302057412", "shivam", "IND");
		
		System.out.println(notification.mobileNumber);
		System.out.println(notification.userName);
		System.out.println(notification.country);

	}

}
