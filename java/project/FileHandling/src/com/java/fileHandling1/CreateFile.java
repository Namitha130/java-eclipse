package com.java.fileHandling1;
import java.io.IOException;
import java.io.File;
public class CreateFile {
	public static void main(String[] args) 
	{
		try {
			File myfile=new File("C:\\\\filehandling\\\\File1.java");
			if(myfile.createNewFile())
			{
				System.out.println("File crrated "+myfile.getName());
			}
			else
			{
				System.out.println("File already Exists");
			}
		}
		catch(IOException io)
		{
			System.out.println("error occcuredd");
			io.printStackTrace();
		}
	}
}
