package com.kodewala.oops.inheritance1;

public class ClothingProduct extends Product 
{
	String type;
	boolean isExchange;
	
	public ClothingProduct(String productName, String description, int quantity, String status, String type,
			boolean isExchange) {
		super(productName, description, quantity, status);
		this.type = type;
		this.isExchange = isExchange;
	}



	public void viewClothingProduct() 
	{
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		
		System.out.println(type);
		System.out.println(isExchange);
	}
	
	

}
