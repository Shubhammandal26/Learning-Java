package com.kodewala.strings;


class User
{
	String name;
	
	public User(String name) {
		 this.name=name;
	}

	
}
public class Driver1 {

	public static void main(String[] args) 
	{
		String city1 = "Bangalore";
		
		String city3 = "Bangalore";
		
		
		// string class equals method is meant for content comparison
		System.out.println(city1.equals(city3));  // true
		
		User user1 = new User("kodewala");
		User user2 = new User("kodewala");
		
		// for non string class equal meant for reference comparison we are compare reference using equals() method
		System.out.println(user1.equals(user2)); // false

	}

}
