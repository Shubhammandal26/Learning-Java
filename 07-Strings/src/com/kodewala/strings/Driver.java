package com.kodewala.strings;

public class Driver {

	public static void main(String[] args) 
	{
		
		String firstName = "Kodewala";  // object created in SCP --> firstName's address --> xyz123
		String lastName = "Kodewala";   // object with content "Kodewala" already created
		                                // and lastName will refer to existing object.
		                                // lastName also pointing to address xyz123
		
		System.out.println(firstName == lastName); // will compare the address of an object

	}

}
