package com.kodewala.exception4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver1 {

	public static void main(String[] args) throws IOException 
	{
		String fileName = "text.xls";
		
		try(FileOutputStream fos = new FileOutputStream(new File(fileName))) // try with resources
		{
		// auto closable
			 String name = "akak";
			 name.charAt(0);
			 
			 
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			
		} catch(IOException e)
		{
			e.printStackTrace();
		} 
		
	}

}
