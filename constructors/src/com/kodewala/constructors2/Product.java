package com.kodewala.constructors2;

public class Product {
	
	String productName;
	int price;
	String description;
	int quantity;
	
	Product(String _productName, int _price, String _description, int _quantity){
		System.out.println("Product with product name, price, description, and quantity");
		this.productName = _productName;
		this.price = _price;
		this.description = _description;
		this.quantity = _quantity;
	}
	
	Product(String _productName, String _description){
		System.out.println("Product with product name and  description");
		this.productName = _productName;
		this.description = _description;
	}
	
	Product(){
		System.out.println("Product with no attribute");	
	}
	

}
