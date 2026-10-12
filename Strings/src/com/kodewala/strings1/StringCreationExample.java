package com.kodewala.strings1;

public class StringCreationExample {

	public static void main(String[] args) 
	{
//		using literals
		
		String s1 = "Kodewala";
		String s2 = "Kodewala";
		
//		using new keyword
		
		String s3 = new String("Kodewala");
		String s4 = new String("Kodewala");
		
//		comparing memory address
		
	  System.out.println("s1 == s2: " + (s1== s2));  // true
	  System.out.println("s3 == s4: " + (s3 == s4));  // false
	  System.out.println("s1 == s3: " + (s1 == s3));  // false
	  
//	  comparing content Meaningfully equal or not
	  
	  System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
	  System.out.println("s3.equals(s4)" + s3.equals(s4)); //  true
	  System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
		
     		

	}

}
