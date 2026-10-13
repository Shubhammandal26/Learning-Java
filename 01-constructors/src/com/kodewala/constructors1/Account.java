package com.kodewala.constructors1;

public class Account {
	int amount;
	String name;
	// if developer is not providing any constructor in a class then in a class compiler will add default
	//  constructor (no arg constructor)
	
	Account(){
	System.out.println("inside Account()");	
	}
	
	Account(int _amount, String _name){
		System.out.println("inside Account(int _amount, String _name)");	
		this.amount = _amount;
		this.name = _name;
	}

}
