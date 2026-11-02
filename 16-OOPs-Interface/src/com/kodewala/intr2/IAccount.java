package com.kodewala.intr2;

@FunctionalInterface
// annotation is optionally 
public interface IAccount 
{
  String openAccount(String name, String address, int balance); // only one abstract method - SAM + one abstract method from IAccountMgmt
  
  default void addBeni()
  {
	  
  }
}
