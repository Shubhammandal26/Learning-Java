package com.kodewala.constructors4;

 class SuperUser extends Object
 {
	 
 }


public class User extends SuperUser  {
	
	String userName;
	String userId;
	String mobile;
	
	public User(String _userName, String _userId, String _mobile) 
	{
		this();   // calling same class(User) constructor
		
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
	}
	
	User(){
		System.out.println("User() ...no args");
	}

}
