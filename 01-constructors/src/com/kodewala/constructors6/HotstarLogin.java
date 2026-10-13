package com.kodewala.constructors6;

public class HotstarLogin extends Hotstar 
{
	String country;
	
	public HotstarLogin(String _mobileNumber, String _userName, String _country) {
		super(_mobileNumber, _userName);
		this.country = _country;
	}

	
	
	

}
