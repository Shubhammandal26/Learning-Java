package com.kodewala.constructors3;

public class DebugStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student("shubham", 80);
         student.display();
	}
}

  class	Student{
	  
	  String name;
	  int marks;
	  
	  public Student(String _name, int _marks) {
		this.name = _name;
		this.marks = _marks;
	}
	  
	  void display() {
		  System.out.println(name);
		  System.out.println(marks);
	  }
  }


