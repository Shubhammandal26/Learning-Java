package com.kodewala.constructors6;

public class DeveloperEmployee {

	public static void main(String[] args) 
	{
		Developer developer = new Developer("E101", "shubham", 98500.00, "Java", "EmployeeManagement System");
		
		System.out.println(developer.employeeId);
		System.out.println(developer.employeeName);
		System.out.println(developer.salary);
		System.out.println(developer.programmingLanguage);
		System.out.println(developer.projectName);


	}

}
