package com.scan.ex2;
import java.util.Scanner;

public class Utilization 
{
	public static void main(String[] args)
	{
		System.out.println("Enter student details:");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student name:");
		String name = scan.next();
		System.out.println("Enter student ID:");
		int id = scan.nextInt();
		System.out.println("Enter student mobile number:");
		long mob_no = scan.nextLong();
		// creating student class object
		Student std = new Student(name,id,mob_no);
		System.out.println("Student details added successfully");
		std.show_student_details();
	}
}