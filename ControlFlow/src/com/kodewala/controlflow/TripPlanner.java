package com.kodewala.controlflow;

public class TripPlanner 
{
	public String suggestPlan(String srs, String dest, int fair)
	{
		String suggestion = null;
		if(fair <= 1000) 
		{
			suggestion = "You can be in your home only";
			System.out.println(suggestion);
			
		}
		else if(fair > 1000 && fair <= 3000)
		{
			suggestion = "You can visit with in city like lal bagh etc... or you can watch movie near";
			System.out.println(suggestion);
			
		}
		else if(fair > 3000 && fair <= 5000)
		{
			suggestion = "You can hire a taxi and visit near by place like mysore etc...";
			System.out.println(suggestion);
			
		}
		else {
			suggestion = "you can visit goa";
			System.out.println(suggestion);
		}
		return suggestion;
	}

}
