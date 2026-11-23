package com.kodewala.collection1;

public class Driver {

	public static void main(String[] args) 
	{
//		1.store the price --> container(box) which holds integer value
		
		int price[] = {200, 5000, 100, 200, 300, 500, 23456, 5600};  // Memory --> Heap --> Store to DataBase(JDBC)
		
//		2. Process --> find the price value above 1000
		
		for(int index = 0; index < price.length; index++)
		{
			int currentPrice = price[index];
			
			if(currentPrice > 1000)
			{
				System.out.println(currentPrice);
			}
		}

	}

}
