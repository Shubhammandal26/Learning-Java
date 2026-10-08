package com.kodewala.loops1;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int luckyNumber = 13;
		int userEnter = 0;
		
		while (luckyNumber != userEnter) 
		{
			System.out.println("Please enter the number...");
			userEnter = sc.nextInt();
			
			if(userEnter == luckyNumber) {
				System.out.println("You won!!!");
			}
			else {
				System.out.println("Please try again...");				
			}
		}
		sc.close();

	}

}
