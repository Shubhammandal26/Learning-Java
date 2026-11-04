package com.kodewala.intr3;

public class User implements Cleanable
{
	String userName;
	String id;
	
	public User(String userName, String id) {
		super();
		this.userName = userName;
		this.id = id;
	}
}
