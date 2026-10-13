package com.kodewala.object;

public class User {
	String userName;
	String userId;
	String mobileNumber;
	
//	static block will get executed just after the class loading
//	it will common to all and print only onces
	
	static 
	{
		System.out.println("I am in static init block");
	}

	User(String userName, String userId, String mobileNumber) 
	{
		super();
		System.out.println("User.user(String userName, String userId,String mobileNumber).. constructor ");
		this.userName = userName;
		this.userId = userId;
		this.mobileNumber = mobileNumber;

	}

}
