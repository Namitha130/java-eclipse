package com.scan.ex2;
import java.util.Scanner;
public class Student 
{
	String std_name ;
	int std_id;
	long std_mob_no;
	
	public Student(String std_name, int std_id, long std_mob_no) 
	{
		this.std_name = std_name;
		this.std_id = std_id;
		this.std_mob_no = std_mob_no;
	}
	
	public void show_student_details()
	{
		System.out.println(std_name+ " "+ std_id +" "+ std_mob_no);
	}
	
}
