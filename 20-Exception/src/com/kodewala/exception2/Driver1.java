package com.kodewala.exception2;

public class Driver1 {

	public static void main(String[] args) 
	{
		Driver1 driver = new Driver1();
		int result = driver.calculateDiscount(100, 10);
		System.out.println(result);

	}
	
	private int calculateDiscount(int amount, int disc)
	{
		int finalAmt = 0;
		try
		{
			finalAmt = amount - (amount * disc / 100);  
			return finalAmt; // return values has been decided
			
		} catch (Exception e)
		{
		System.out.println("Some exception....");
		e.printStackTrace();
		} finally 
		{
		  finalAmt = 110;	
		}
		return finalAmt; // again returning value
	}

}
