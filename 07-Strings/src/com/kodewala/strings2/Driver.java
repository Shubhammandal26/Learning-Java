package com.kodewala.strings2;

public class Driver {

	public static void main(String[] args) 
	{
		
//		interview question asked ? How many object created?
		
		String s1 = "This " + "is from" + " kodewala Academy Bangalore";
		
//		optimized at compile time
		
//		String s1 = "This is from kodewala Academy Bangalore";
		System.out.println(s1);
		
		String s2 = "Kodewala"; // SCP
		String s3 = "Academy"; // SCP
		String s4 = s2 + s3;  // Heap --> new StringBuilder();
		System.out.println(s4);
		
//		String s5 = s3 + " Bangalore"; 
//		System.out.println(s5);
		
		String s6 = "KodewalaAcademy";
//		System.out.println(s6 == s4); // false
//		intern() - start referring the object from SCP if exists else it will copy to SCP and start referring. 
		
		System.out.println(s6 == s4.intern());  // true
	}

}
