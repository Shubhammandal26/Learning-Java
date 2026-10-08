package com.amazon.demo;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World....");
		int amount = 200;
		String city = args[0];
		System.out.println("Amount is: " + amount + " " + city);
		HelloWorld.doSomething();
		

	}

	public static void doSomething() {
		System.out.println("HelloWorld.doSomething()");
	}

}
