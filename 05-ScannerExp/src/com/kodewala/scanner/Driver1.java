package com.kodewala.scanner;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int  price = 0;
		System.out.println("Please enter the price...");
		
		if(sc.hasNextInt()) {
			 price = sc.nextInt();			
		}
		else {
		System.out.println("Please enter the price in the right format");	
		}
			System.out.println("Price : " + price);
			sc.close();

	}

}
