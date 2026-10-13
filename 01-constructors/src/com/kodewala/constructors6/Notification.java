package com.kodewala.constructors6;

public class Notification  extends Netflix
{
	String country;
	
	public Notification(String _mobileNumber, String _userName, String _country) 
	{
		super(_mobileNumber, _userName);
		this.country = _country;
		
	}
	
  }
