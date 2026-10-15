package com.kodewala.oops.inheritance;

class Employee
{
	String name = "Shubham";
	String address = "Bangalore";
	
	private String empCode = "IC1234";  // can access within the same class
	
	public void markIn(String empId) 
	{
	System.out.println("Marking IN " + empId);	
	}
	
}

// Manager IS-A Employee

class Manager extends Employee
{
	public void doSomething() {
		System.out.println(name);   // using the parent class attribute
		System.out.println(address);
//		System.out.println(empCode); 
		markIn(address);  // using the parent class method
	}
	
}

public class Driver1 
{
	public static void main(String[] args) 
	{
    Manager manager = new Manager();
    manager.doSomething();

	}

}
