package com.kodewala.arrays;

public class Employee {

	String name;
	int salary;
	String department;

	public Employee(String _name, int _salary, String _department) 
	{
		this.name = _name;
		this.salary = _salary;
		this.department = _department;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee("Shubham", 85000, "Java Developer");
		Employee employee2 = new Employee("Ritesh", 55000, "Trainee");
		Employee employee3 = new Employee("Ankit", 65000, "sales");
		Employee employee4 = new Employee("Sudesh", 45000, "Tester");
		Employee employee5 = new Employee("pratik", 25000, "Content Moderater");
		
		Employee emp[] = new Employee[5];
		
		emp[0] = employee1;
		emp[1] = employee2;
		emp[2] = employee3;
		emp[3] = employee4;
		emp[4] = employee5;
		
		for(int i = 0; i < emp.length; i++) 
		{
			if(emp[i].salary > 50000) 
			{
				System.out.println("Employee Name is: " + emp[i].name);
			}
		}
		
		
		

	}

}
