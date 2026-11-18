package com.kodewala.exception2;

public class Driver2 {

	public static void main(String[] args)
	{
//		String name = null;
//		System.out.println(name.length());
		
		String className = "com.kodewala.exception2.Driver2";
		
		try {
			Class.forName(className);
			System.out.println("class loaded...");
			
		} catch (ClassNotFoundException e) 
		{	
			e.printStackTrace();
		}
		
	}
}
