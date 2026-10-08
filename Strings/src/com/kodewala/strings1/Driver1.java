package com.kodewala.strings1;

public class Driver1 {

	public static void main(String[] args) 
	{
		String s = "Kodewala"; // SCP
//		in case i want to change s
		
		s.concat(" Academy");
		
//		String s2 = s.concat(" Academy"); // trying to change the object
//		object created in heap with content Kodewala Academy
		
		System.out.println(s);
//		System.out.println(s2);  // Kodewala Academy
	}

}
