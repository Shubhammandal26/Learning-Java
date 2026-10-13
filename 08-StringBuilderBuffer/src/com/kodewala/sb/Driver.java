package com.kodewala.sb;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Kodewala");
		
//		modify the string object in the Heap
		sb.append(" Academy");
		
		System.out.println(sb);  // Kodewala Academy

	}

}
