package com.kodewala.controlflow2;

public class RailwayTicket {

	public static void main(String[] args) 
	{
		RailwayTicket railwayTicket = new RailwayTicket();
		
		String passengerType = args[0];
		int passengerAge = Integer.parseInt(args[1]);
		double fare = Double.parseDouble(args[2]);
		
		railwayTicket.calculateFare(passengerType, passengerAge, fare);
		
	}
	
	public void calculateFare(String passenger, int age, double basefare)
	{
		double discount = 0;
		
	  switch (passenger) {
	case "Infant":
		if(age < 5) {
			discount = basefare * 1.00;
		} else {
			System.out.println("Invalid age for Infant");
		   return;	
		}
		break;
		
	case "Child":
		if(age >= 5 && age <= 12) {
			discount = basefare * 0.50;
		} else {
			System.out.println("Invalid age for child");
			return;
		}
         break;
         
	case "Adult":
		if(age >= 13 && age <= 59) {
			discount = basefare * 0;
		} else {
			System.out.println("Invalid age for Adult");
			return;
		}
         break;
         
	case "Senior":
		if(age >= 60) {
			discount = basefare * 0.40;
		} else {
			System.out.println("Invalid age for senior");
			return;
		}
         break;
         
         
         
	default:
		System.out.println("Please enter valid age");
		break;
	}
	  double finalFare = basefare - discount;
	  System.out.println("Passenger type : " + passenger);
	  System.out.println("Discount is: " + discount);
	  System.out.println("Final fair: " + finalFare);
	}

}
