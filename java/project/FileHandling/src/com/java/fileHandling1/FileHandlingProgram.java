package com.java.fileHandling1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class FileHandlingProgram {
	public static void main(String[] args) 
	{
		try {
			File myfile=new File("C:\\\\filehandling\\\\File123.java");
			if(myfile.createNewFile())
			{
				System.out.println("File crrated "+myfile.getName());
			}
			else
			{
				System.out.println("File already Exists");
			}
				// write a message in a file
				FileWriter f1= new FileWriter("C:\\filehandling\\File123.java");
				f1.write("Build amazing things");
				f1.write("\nTake your JavaScript");
				f1.write("\ndevelopment up a notch");
				f1.write("\nGood Morning!!!");
				f1.close();
				System.out.println("Successfully wrote a file");
				
					try 
					{
						File fr =new File("C:\\filehandling\\File123.java");
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
				
				File del = new File("C://filehandling\\file123.java");
				if(del.delete()) {
					System.out.println("File deleted succesffully");
				}
				else {
					System.out.println("File not deleted ");
				}
			}
			catch(IOException io)
			{
				System.out.println("error occcuredd");
				io.printStackTrace();
			}
			
		
		
			
		
	}
}
