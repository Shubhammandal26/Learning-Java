package com.tcs.emp;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Address address = new Address("16th", " 2nd cross", "Bangalore");
		
		Employee emp1 = new Employee("Kodewala", "Kod123", address);
		
		 Employee cloneEmp = (Employee) emp1.Clone();
		 
		 emp1.address.city = "Hyderabad";  // change city to Hyderabad from Bangalore
				 
		 System.out.println(emp1.address.city);
		 System.out.println(cloneEmp.address.city);

	}

}
