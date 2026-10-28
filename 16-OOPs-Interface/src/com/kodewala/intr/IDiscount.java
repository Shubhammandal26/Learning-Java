package com.kodewala.intr;

// java version 1.7 or 7 OR before
public interface IDiscount 
{
//	public abstract int calculateDiscount
//	public static final -> constant
	public static final int MAX_VALUE = 200;
	public abstract int calculateDiscount(int amount, int rate);  // abstract -> idea or thought
	
	public abstract void calculateDiscountTax(int tax);
	public abstract void calculateDiscountTax(int tax, String type); // overloading
	
}
