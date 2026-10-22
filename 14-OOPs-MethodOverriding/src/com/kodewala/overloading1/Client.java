package com.kodewala.overloading1;

class Login
{ 
	public void doLogin(String mobile, int otp) 
	{
		System.out.println("Login.doLogin(String mobile, int otp)");
	}
	
	public void doLogin(String email, String password) 
	{
		System.out.println("Login.doLogin(String email, String password)");	
	}
	
	public void doLogin(String gmail)
	{
		
		System.out.println("Login.doLogin(String gmail)");
	}
	
	
}

public class Client {

	public static void main(String[] args) 
	{
		Login login = new Login();
		login.doLogin("7894561203", 70029);
		login.doLogin("shubh@gmail", "qwerty123");
		login.doLogin("shubham@gmail");

	}

}
