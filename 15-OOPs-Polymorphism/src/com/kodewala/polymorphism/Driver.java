package com.kodewala.polymorphism;

class User
{
	public void doSomething()
	{
		System.out.println("User.doSomething()..... User");
	}
}

class AdminUser extends User
{
	public static void doSome() {
		System.out.println("AdminUser.doSome().... AdminUser");
	}
	
}

class FinacUser extends User
{
	
}


public class Driver {

	public static void main(String[] args) 
	{
//		User u1 = new User();
//		AdminUser au1 = new AdminUser();
		
//		Parent class can refer child class object --> auto up-casting
		User au2 = new AdminUser(); // up casting
		
//		Object au3 = new FinacUser();
		
//		Child class is referring parent class object --> down casting
		AdminUser au = (AdminUser) au2; // Down casting
		
		au.doSomething();
		AdminUser.doSome();
	}

}
