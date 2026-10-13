package com.kodewala.constructors6;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectronicProduct electronicProduct = new ElectronicProduct("iPhone",18000,"E101", 2);
		System.out.println(electronicProduct.name);
		System.out.println(electronicProduct.price);
		System.out.println(electronicProduct.productId);
		System.out.println(electronicProduct.warranty);
		

	}

}
