package com.kodewala.abstraction;

public class Order 
{
	public boolean orderPlaced(String itemName, int price, boolean isAvailable, String address)
	{
		System.out.println("Order.orderPlaced().. order placed");
		orderCheck(itemName);
		orderAvailable(isAvailable);
		return true;
	}
	
	private boolean orderCheck(String itemName)
	{
		System.out.println("Order.orderCheck()... order is checking");
		return true;
	}
	
	private boolean orderAvailable(boolean isAvailable)
	{
		System.out.println("Order.orderAvailable().. order is available");
		return true;
	}

}
