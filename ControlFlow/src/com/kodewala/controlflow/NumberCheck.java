package com.kodewala.controlflow;

public class NumberCheck {

	public static void main(String[] args) 
	{
	   NumberCheck check = new NumberCheck();
	  String result = check.checkNumber(10);
	  System.out.println("Check Number: " + result);

	}
	public String checkNumber(int number)
	{
		
		if(number % 2 == 0) {
		 return "even number";	
		}
		else {
			return "odd number";
		}
	}

}
