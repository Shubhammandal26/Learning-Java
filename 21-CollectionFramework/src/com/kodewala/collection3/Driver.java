package com.kodewala.collection3;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) 
	{
		int amount = 100;
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Bengaluru");
		cities.add("Mysore");
		cities.add("Hyderabad");
		cities.add("Chennai");
		cities.add("Ahmedabad");
		cities.add("Delhi");
		cities.add("Mumbai");
		
		cities.remove(3);
		cities.add("Kolkata");
		cities.add("Delhi");
		System.out.println(cities);
		cities.get(5);
		
		System.out.println(amount);

	}

}
