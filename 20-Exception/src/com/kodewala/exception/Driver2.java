package com.kodewala.exception;

public class Driver2 {

	public static void main(String[] args) 
	{
   System.out.println("Driver1.main()... START");
		
		Driver1 driver1 = new Driver1();
		driver1.doSomething();
		
		System.out.println("Driver1.main()... END");
	}

	void doSomething()
	{
		System.out.println("Driver1.dosomething()... START");
		
		int amount = 100;
		
		try {
//			Risky code -> code which may throw an exception
			amount = amount / 0;
//			System.out.println(name.length()); // NPE -> not handle
			System.out.println("After length()"); // Ignore
			
		} catch(ArithmeticException e) // This can catch Exception's object and its child objects
		{
			System.out.println(" amount can not be / by zero");
			e.printStackTrace();
		}
		System.out.println("Driver1.doSomething() END");
	}

}


