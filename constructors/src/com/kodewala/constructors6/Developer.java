package com.kodewala.constructors6;

public class Developer extends Employee 
{
   String programmingLanguage;
   String projectName;
	
	Developer(String _employeeId, String _employeeName, double _salary,String _programmingLanguage, String _projectName) {
		super(_employeeId, _employeeName, _salary);
		this.programmingLanguage = _programmingLanguage;
		this.projectName = _projectName;
	}
	

  }
