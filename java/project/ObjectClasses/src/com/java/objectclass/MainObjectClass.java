package com.java.objectclass;
class Student
{
	String std_name;
	int std_id;
	long std_mob;
	public Student(String std_name, int std_id, long std_mob) 
	{
		this.std_name = std_name;
		this.std_id = std_id;
		this.std_mob = std_mob;
	}
	public void show_student_details()
	{
		System.out.println("Student name:" + std_name);
		System.out.println("Student ID:" + std_id);
		System.out.println("Student contact number:" + std_mob);
	}
	
}
public class MainObjectClass {
	public static void main(String[] args)
	{
		Student[] std= new Student[3];
		std[0]= new Student("Namitha",101,876543345l);
		std[0].show_student_details();
		System.out.println("---------------");
		std[1]= new Student("Nishvika",102,876543345l);
		std[1].show_student_details();
		System.out.println("---------------");
		std[2]= new Student("Nammi",103,876543345l);
		std[2].show_student_details();
	}
}
