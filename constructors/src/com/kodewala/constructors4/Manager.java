package com.kodewala.constructors4;

public class Manager extends Employees {
	String department;

	Manager(String name, String department) {
		super(name);
		this.department = department;
		System.out.println(name + " is a manager of " + department);
	}

	public static void main(String[] args) {

		Manager m = new Manager("Jay", "IT");
		
	}

}
