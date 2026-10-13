package com.kodewala.scanner;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // create connection with console
		
		System.out.println("Enter the name: ");
		String name = sc.nextLine(); // reading string input
		
		
		
		System.out.println("Pls enter product price....");
		int price = sc.nextInt(); // reading int -> this will leave the new line char \n
		sc.nextLine(); // consume the extra char
		
		System.out.println("Pls enter delivery address");
		String address = sc.nextLine();
		
		System.out.println("Name is: " + name);
		System.out.println("Price is: " + price);
		System.out.println("Address is: " + address);
		
		sc.close();
		

	}

}
