package com.kodewala.polymorphism;
class Employee
{
	public void markIn() {
		System.out.println("Employee.markIn()......Employee Marknig IN");
	}
}
class HRManager extends Employee
{
	@Override
	public void markIn() 
	{
	System.out.println("HRManager.markIn().....HRManager Marknig IN");	
	}
}
public class Driver1 {
	public static void main(String[] args) {
//		Employee e = new Employee();
//		e.markIn();
//		Parent class can refer child class object
		Employee e1 = new HRManager();
		e1.markIn(); // same object will behave differently based on the actual object
//		1.at the time of compilation,it will check the method's exist in class
//		2. at the time of execution(while running), it will call the method on actual
	}

}
