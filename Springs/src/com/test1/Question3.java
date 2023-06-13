package com.test1;

class Student
{	
	String name="namitha";
	int id = 101;
	long mobile_no =9876543222l;
	
	public void student_details()
	{
		System.out.println("student name :" +name );
		System.out.println("student id :"+ id);
		System.out.println("student contact number: "+ mobile_no);
	}
}
class College extends Student
{	
	@Override
	public void student_details()
	{	
		super.student_details();
		System.out.println("student login successfully");
	}
}
public class Question3 
{
	public static void main(String[] args) {
		
		College c1 = new College();
		c1.student_details();
	}

}
