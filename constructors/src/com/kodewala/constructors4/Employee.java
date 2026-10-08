package com.kodewala.constructors4;

public class Employee extends Company 
{
	 String name;
	 int id;
	 String address;
	 
	Employee(String _companyName,String _name, int _id, String _address)
	{
		super(_companyName);
		this.name = _name;
		this.id = _id;
		this.address = _address;
		System.out.println(name + " is an employee of " + companyName + " with employee id " + id + " and he is leaving in " + address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Infosys", "shubham", 101, "BTM Layout 1st stage Bengaluru");

	}

}
