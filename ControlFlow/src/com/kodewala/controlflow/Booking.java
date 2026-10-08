package com.kodewala.controlflow;

public class Booking 
{
	// more than 6 pax per PNR is not allowed
  public String doBooking(String from, String to, int noOfPax)
	{
		String pnr = null;
		
		if(noOfPax > 6)	 // if true then only below code gets executed.
		{
			System.err.println("As per IRCTC policy, only 6 pax are allowed per PNR");
				
		}
		else
		{
			pnr = "7894561201";
			System.out.println("Confirming the booking: " + pnr);
			System.out.println("Status: confirmed ");
			System.out.println("Seat 23 A1: ");
		}
		return pnr;
		
	}

}
