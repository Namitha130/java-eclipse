package com.jsp.filehandling;
import java.io.File;
public class DeleteAfile {
	public static void main(String[] args) 
	{	
		File del = new File("c://filehandling\\file2.java");
		if(del.delete()) {
			System.out.println("File deleted succesffully");
		}
		else {
			System.out.println("File not deleted ");
		}
	}
}
