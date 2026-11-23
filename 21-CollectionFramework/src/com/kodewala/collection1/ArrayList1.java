package com.kodewala.collection1;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) 
	{
//		Create a container which will hold something(Objects)
		
		ArrayList<String> learner = new ArrayList<String>();
		
//		Storing the data
		
		learner.add("Gautam");  // sequence order
		learner.add("Prince");
		learner.add("Aman");  // allow duplicate
		learner.add("Rohit");
		learner.add("Gautam");
		learner.add("Aman"); // // allow duplicate
		learner.add(null);  // allow multiple null
		learner.add(null);  // allow multiple null

//		read the data from container or arrayList
		
		System.out.println(learner);
	}

}
