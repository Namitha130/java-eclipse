package com.jsp.filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteAFile {
	public static void main(String[] args) 
	{
		try {
			FileWriter f1= new FileWriter("C:\\filehandling\\File2.java");
			f1.write("Hii");
			f1.write("\nHello");
			f1.write("\nBye!!!");
			f1.write("\nGood Morning!!!");
			f1.close();
			System.out.println("Successfully wrote a file");
		
		}
		catch(IOException ie){
			System.out.println("An erroe occured");
			ie.printStackTrace();
		}
	}
}
