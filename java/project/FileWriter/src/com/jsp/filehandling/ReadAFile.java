package com.jsp.filehandling;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class ReadAFile
{
	public static void main(String[] args) 
	{
		try 
		{
			File fr =new File("C:\\filehandling\\File1.java");
			Scanner scan= new Scanner(fr);
			while(scan.hasNext())
			{
				String s1= scan.next();
				System.out.println(s1);
			}
		}
		catch(FileNotFoundException fo)
		{
			System.out.println("error occured");
			fo.printStackTrace();
		}
	}
}
