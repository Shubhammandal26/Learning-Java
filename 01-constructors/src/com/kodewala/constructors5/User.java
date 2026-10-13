package com.kodewala.constructors5;

/**
 * This is a Netflix end user
 */
public class User {
	
	String name;
	String type;
	String country;
	
	 User(String _name, String _type, String _country) 
	 {
		 this.name = _name;
		 this.type = _type;
		 this.country = _country;
		
	}
	 
	 public User() 
	 {
		this("user123", "guest_user", "IN");
	}

}
