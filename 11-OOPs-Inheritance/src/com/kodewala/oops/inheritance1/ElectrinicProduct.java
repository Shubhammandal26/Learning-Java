package com.kodewala.oops.inheritance1;

public class ElectrinicProduct extends Product
{
	boolean isWarrenty;
	int warrentyInYears;
	
	public ElectrinicProduct(String productName, String description, int quantity, String status, boolean isWarrenty,
			int warrentyInYears) 
	{
		super(productName, description, quantity, status);
		this.isWarrenty = isWarrenty;
		this.warrentyInYears = warrentyInYears;
	}
	
	public void viewElectronicProductDetails() 
	{
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		
		System.out.println(isWarrenty);
		System.out.println(warrentyInYears);
	}
	

}
