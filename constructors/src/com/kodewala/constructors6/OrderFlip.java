package com.kodewala.constructors6;

public class OrderFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineOrder online = new OnlineOrder(101, "Shubham", 2500, "UPI", "Bangalore");
		
		System.out.println(online.orderId);
		System.out.println(online.customerName);
		System.out.println(online.amount);
		System.out.println(online.paymentMode);
		System.out.println(online.deliveryAddress);
		

	}

}
