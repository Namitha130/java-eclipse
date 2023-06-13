package com.java.fileHandling1;

import java.io.File;

public class PropertiesOfFileHandling 
{
	public static void main(String[] args) 
	{
		
		File myfile =new File("C:\\filehandling\\File1.java");
		if(myfile.exists()) 
		{
			System.out.println("File Exits");
			System.out.println(myfile.canRead());
			System.out.println(myfile.canWrite());
			System.out.println(myfile.getAbsolutePath());
			System.out.println(myfile.length());
			System.out.println(myfile.getName());
			
		}
		else {
			System.out.println("File not found");
		}
	}
}
