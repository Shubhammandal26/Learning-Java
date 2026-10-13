package com.kodewala.constructors4;


class Users extends Object
{
  Users(int a) 
  {
	  super(); // calling super class no args constructor
  }
}

public class User1 extends Users {
	 String userName;
	 String userId;
	 String phone;
	 
	 
	 User1(String _userName,String _userId,String _phone)
	 {
	     super(23); // calling super class constructor without arg. 
	     // first line of constructor is either super or this. If we are not writing super or this
	     // then compiler will consider super()
	 
		 this.userName = _userName;
		 this.userId = _userId;
		 this.phone = _phone; 		 
	 }
	

}
