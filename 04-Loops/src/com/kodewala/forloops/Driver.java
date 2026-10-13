package com.kodewala.forloops;

public class Driver {

	public static void main(String[] args) {

		String[] cities = { "Mumbai", "Delhi", "Patna", "Hyderabad", "Chennai", "Kolkata", "Pune", "Ahmedabad",
				"Jaipur", "Lucknow", "Bengaluru", "Indore","Chandigarh","Bengaluru", "Kanpur", "Ranchi", "Bhubaneswar", "Bengaluru", "Surat",
				"Nagpur", "Patna", "Varanasi" };
		
		for(int index = 0; index < cities.length; index++) {
			if(cities[index].equals("Bengaluru")) {
               System.out.println("Found City name start with Bengaluru: ");
               break; // used to break the loop
			}
		}

	}

}
