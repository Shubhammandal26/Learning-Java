package com.kodewala.constructors6;

public class HotstarApp {

	public static void main(String[] args) 
	{
		HotstarLogin hl = new HotstarLogin("7896541230", "shivam", "INDIA");
		System.out.println(hl.mobileNumber);
		System.out.println(hl.userName);
		System.out.println(hl.country);
	}

}
