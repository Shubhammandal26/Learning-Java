package com.kodewala.arrays;

public class Citys 
{
	public static void main(String[] args) 
	{
	 String	cities[]  = new String[5]; 
	 
		cities[0] = "Bangalore";
		cities[1] = "Chennai";
		cities[2] = "Bhubaneswar";
		cities[3] = "Surat";
		cities[4] = "Bhopal";
		
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].startsWith("B")) {
				System.out.println("City start with 'B' is:  " + cities[i]);
			}
		}
		
	}
}
