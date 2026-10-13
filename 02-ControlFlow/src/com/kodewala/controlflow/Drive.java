package com.kodewala.controlflow;

/**
 * makeMytrip discount module
 */
public class Drive 
{
	String suggest = null;
	double discount = 0;
	
	public double doTrip(String from, String to, int fare)
	{
		// if fare is 5000 and below then no discount
		
		if(fare < 5000) {
			discount = fare * 0.5;
			System.out.println("No discount applied");
			 return discount;
		} 
		else if  (fare < 5000 && fare > 10000) {
			discount = fare * 0.10;
		 
			System.out.println("10% of total fare as a discount");
			 return discount;
		} 
		else  {
			discount = fare * 0.15;
		
			System.out.println("15% discount");
        return discount;
		}
		
	}
	 }


// if fare is 5000 and below, no discount applied
// if fare is between 5000 to 10000 then 10% of total fare as a discount
// if fare is more than 10000 then 15% discount
// maximum discount per customer is 1250 only.
