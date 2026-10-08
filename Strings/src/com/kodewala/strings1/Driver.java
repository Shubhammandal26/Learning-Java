package com.kodewala.strings1;

public class Driver {

	public static void main(String[] args) 
	{
		
		String s1 = "Kodewala"; // SCP --> 123sfg
		
		String s2 = new String("Academy"); // one object in SCP + one in heap --> 789tyu
		
		System.out.println(s1 == s2); // 123sfg == 789tyu -->  false
		
		String s3 = "Kodewala"; // already in SCP
		String s4 = "Kodewala"; // already in SCP
		
		System.out.println(s3 == s4); // true
		
//		equals() compares the content
		System.out.println(s3.equals(s4)); // true because it check both content are same 

	}

}
