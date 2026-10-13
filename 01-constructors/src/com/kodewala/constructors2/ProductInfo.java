package com.kodewala.constructors2;

public class ProductInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product("iPhone", 70000, "iphone 256 GB Ram", 10);
		System.out.println("Product: " + product.productName + " and " + product.price + 
				" and " + product.description + " and " + product.quantity);
		System.out.println();
		
		
		Product product1 = new Product("Laptop", "8 GB Ram");
		System.out.println("product: " + product1.productName + " and " + product1.description);
		System.out.println();
		
		Product product2 = new Product();
		System.out.println(product2.productName + " and " + product2.price + " and " 
		+ product2.description + " and " + product2.quantity);
		
		
	}

  }
