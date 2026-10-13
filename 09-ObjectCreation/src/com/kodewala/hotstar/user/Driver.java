package com.kodewala.hotstar.user;

import com.kodewala.hotstar.User;

public class Driver {

	public static void main(String[] args) {
		
		User u1 = new User("Kodewala", "K123", "Paid");
		User u2 = new User("Kodewala Academy", "K12369", "Paid");
		User u3 = new User("Kodewala Academy", "K12323", "Paid");
		User u4 = new User("Kodewala Academy", "K12345", "Paid");
		

		User u5 = new User("guest", "Free");
		User u6 = new User("guest", "Free");
		User u7 = new User("guest", "Free");
		User u8 = new User("guest", "Free");
		
		System.out.println("Total live users are: " + User.liveUserCount);

	}

}
