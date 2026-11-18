package com.kodewala.exception2;

public class InvoiceService 
{
	public void generateInvoice()
	{
//		Get customer and order details from database
//		[Connect with database --> create db connection] + [get details from db]
		try {
			connectDatabase(); // create connection
			String name = "dfghdf";
			name.lastIndexOf("a");
			System.out.println("Generating an invoice...");
//			closing
			System.exit(0); // killing JVM
			closeDbConnection();
		} catch (Exception e) 
		{
			System.out.println("Some exception");
			e.printStackTrace();
		}
		finally  // mandatory executable block (Exception OR Not Exception)
		{
			System.out.println("I am inside finally block...");
		}
		
	}
	
	private void connectDatabase()
	{
		
	}
	
	private void closeDbConnection()
	{
		
	}

}
