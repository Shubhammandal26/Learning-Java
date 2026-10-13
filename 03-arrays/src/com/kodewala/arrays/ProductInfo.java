package com.kodewala.arrays;

public class ProductInfo {

	public static void main(String[] args) 
	{
		
		Product product1 = new Product("shubham", "9874563212"); 
		Product product2 = new Product("sudesh", "9856321470");
		Product product3 = new Product("ashit", "0123456789");
		Product product4 = new Product("ritesh", "0987654321");
		Product product5 = new Product("aman", "8745120369");
		
		
		Product products[] = new Product[5];
		
		products[0] = product1;
		products[1] = product2;
		products[2] = product3;
		products[3] = product4;
		products[4] = product5;
		
		System.out.println(products[1]);
		
		

	}

}
