package com.kodewala.exception;

class Account
{
	
}
public class Driver {

	public static void main(String[] args) 
	{
		System.out.println("Driver.main()... START");
		
		String name = args[0];  // ArrayIndexOutOfBoundsException
		
		int marks = Integer.parseInt(args[1]); // if we pass five then NumberFormatException
		System.out.println(name);  // shubham
		System.out.println(marks); // 5
		
//		String name = null;
//		System.out.println(name.length()); // NullPointerException
		
		int amount = 100;
		int part = 0;
		int total = amount / part;
		System.out.println(total);  // ArithmeticException
		
//		Account account = null;
		
		System.out.println("TO-DO....");
		System.out.println("TO-DO....");
		System.out.println("TO-DO....");
		System.out.println("TO-DO....");
		System.out.println("TO-DO....");
		System.out.println("Driver.main()... END");

	}

}
