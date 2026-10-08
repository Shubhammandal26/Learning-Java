package com.kodewala.forloops;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 10, -5, 20, -15, 8, -3, 25, -10, 7, -20, 15, -8, 30, -12, 5, -25, 18, -6, 12, -2 };
		
		for(int i = 0; i < numbers.length; i++) 
		{
			int currentNumber = numbers[i];
			if(currentNumber < 0) 
			{
				continue; // skip the current iteration
				
			}
			System.out.println(currentNumber*10);
			
		}

	}

}
