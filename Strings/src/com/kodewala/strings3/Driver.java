package com.kodewala.strings3;

// This class can not become parent
class AccountMgmt
{
	final int UPI_LIMIT = 100000;   // constant in java
	
	public final void doSomething1()
	{
//		able to change the value
		UPI_LIMIT = 20000;  
	}
	
	
	public void doSomething2()
	{
//		some func... android
	}
}

class Account extends AccountMgmt
{
	// final cannot be Override 
	
//		public void doSomething1() {  
//			
//		}
	
	
	@Override
	public void doSomething2() {
		
	}
	
}

public class Driver {

	public static void main(String[] args) 
	{
		
	}

}
