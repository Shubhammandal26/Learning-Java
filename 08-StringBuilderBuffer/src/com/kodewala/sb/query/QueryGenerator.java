package com.kodewala.sb.query;

public class QueryGenerator 
{
	public StringBuilder generateQuery(int salary, String empID) 
	{
		StringBuilder query = new StringBuilder("Select * from employee"); // create query object
		
		if(salary > 0) 
		{
		query.append("where salary = " + salary + ";");	 // modify existing object
		}
		else if(empID != null) 
		{
			query.append("where empID = " + empID +  ";");    // modify existing object
		}
		else 
		{
			query.append(";");  // modify existing object
		}
		return query;
	}
}
