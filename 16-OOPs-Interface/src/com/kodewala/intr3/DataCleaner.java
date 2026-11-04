package com.kodewala.intr3;

public class DataCleaner
{
	public void clean(Object obj) // Object obj = new User();
	{
		if(obj instanceof Cleanable)
		{
		System.out.println("Allowed to perform the data cleaning Activity");
		// 100 lines....
		
		} else {
			System.err.println("Not Allowed to perform data cleaning Activity");
		}
	}

	
}
