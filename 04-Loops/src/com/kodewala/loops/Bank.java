package com.kodewala.loops;

public class Bank {

	public static void main(String[] args) {

		Customer customer1 = new Customer("shubham", 2100, "987456321");
		Customer customer2 = new Customer("aman", 1800, "1234567890");
		Customer customer3 = new Customer("suraj", 2200, "987478510");
		Customer customer4 = new Customer("pappu", 1950, "73200698547");
		Customer customer5 = new Customer("amit", 1500, "987432011");

		Customer customer[] = new Customer[5];
		customer[0] = customer1;
		customer[1] = customer2;
		customer[2] = customer3;
		customer[3] = customer4;
		customer[4] = customer5;

		for (int i = 0; i < customer.length; i++) {
			if (customer[i].balance < 2000) {
				System.out.println("Name is: " + customer[i].customerName + ", Balance is: " + customer[i].balance);
			}
		}

	}

}
