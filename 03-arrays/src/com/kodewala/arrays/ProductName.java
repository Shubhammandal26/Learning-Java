package com.kodewala.arrays;

public class ProductName {

	String productName;
	int price;
	String category;

	ProductName(String _productName, int _price, String _category) 
	{
		this.productName = _productName;
		this.price = _price;
		this.category = _category;

	}

	public static void main(String[] args) {
		
		ProductName product1 = new ProductName("T-shirt", 1200, "fashion");
		ProductName product2 = new ProductName("iPhone", 98000, "electronic");
		ProductName product3 = new ProductName("almond", 1200, "grocerry");
		ProductName product4 = new ProductName("laptop", 78000, "electronic");
		ProductName product5 = new ProductName("jeans", 1300, "fashion");
		
		ProductName products[] = new ProductName[5];
		
		products[0] = product1;
		products[1] = product2;
		products[2] = product3;
		products[3] = product4;
		products[4] = product5;
		
		for(int i = 0; i < products.length; i++) 
		{
			if(products[i].price < 1500)
			{
				System.out.println("Product name is: " + products[i].productName + ", and Price is: " + products[i].price);
			}
			
		}
		

	}

}
