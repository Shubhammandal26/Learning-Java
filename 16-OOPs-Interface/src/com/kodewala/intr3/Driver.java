package com.kodewala.intr3;

public class Driver {

	public static void main(String[] args) 
	{
		User user = new User("KOD120", "Kodewala Academy");
		DataCleaner cleaner = new DataCleaner(); 
		cleaner.clean(user);
		
	}

}
