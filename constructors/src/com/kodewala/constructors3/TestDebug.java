package com.kodewala.constructors3;

public class TestDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = firstMethod(10);
		System.out.println("Final result = " + result);

	}
	
	static int firstMethod(int number) {
		
		int value = number + 5;
		
		value = secondMethod(value);
		
		return value;
		
	}
	
	static int secondMethod(int number) {
		int value = number * 2;
		
		value = thirdNumber(value);
		return value;
	}
	
	static int thirdNumber(int number) {
		
		return number - 5;
	}

}
