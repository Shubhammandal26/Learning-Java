package com.kodewala.controlflow;

public class Trip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TripPlanner planner = new TripPlanner();
     
    String trip = planner.suggestPlan("BLR", "BBSR", 3000);
    
    System.out.println(trip);
	}

}
