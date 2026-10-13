package com.kodewala.controlflow2;

public class DiscountApply {

	public static void main(String[] args)
	{
		
		DiscountApply discountApply = new DiscountApply();
		String customer = args[0];
		double amount = Double.parseDouble(args[1]);
		discountApply.calculateDiscount(customer, amount);

	}

	
	public void calculateDiscount(String customerType, double amountPurchase)
	{
		double discount = 0;
		
	
		if(amountPurchase >= 1000) {
		switch (customerType) {
		case "Gold":
			
			discount = amountPurchase * 0.20;
			break;
			
			
		case "Silver":
			discount = amountPurchase * 0.10;
			break;
			
			
		case "Regular":
			discount = amountPurchase * 0.05;
			break;

		default:
			System.out.println("No discount available");
			return;
		}
		if(discount > 2500) {
			discount = 2500;
		}
		System.out.println("Discount: " + discount);
			} else {
				System.out.println("Minimum purchase should be 1000");
			}
	}
}
		
		
  
