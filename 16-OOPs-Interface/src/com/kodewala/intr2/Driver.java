package com.kodewala.intr2;

public class Driver 
{
	public static void main(String[] args) 
	{
	IAccount account = (name, add, amt) -> 
	{
	  System.out.println(" Opening Account for: " + name);
	  return "Account opened";
	};
      String result =  account.openAccount("Shubham", "Bengaluru", 1000);
      System.out.println(result);
	}

}
