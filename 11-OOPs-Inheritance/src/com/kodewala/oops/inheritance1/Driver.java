package com.kodewala.oops.inheritance1;

public class Driver {

	public static void main(String[] args) 
	{
		Product product = new Product("Iphone", "This is an Iphone", 10, "Out-stock");
		product.viewProductDetails();
		
		ElectrinicProduct electrinicProduct = new ElectrinicProduct("Iphone", "This is an Iphone", 10, "Out-stock", true, 5);
		electrinicProduct.viewElectronicProductDetails();
		
		ClothingProduct clothingProduct = new ClothingProduct("Iphone", "This is an Iphone", 10, "Out-stock", "Cooton", true);
		clothingProduct.viewClothingProduct();

	}

}
