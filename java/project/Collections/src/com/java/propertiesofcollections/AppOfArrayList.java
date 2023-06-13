package com.java.propertiesofcollections;

import java.util.ArrayList;

class StudentDataBase
{
	String std_name;
	int std_id;
	long std_contact_no;
	StudentDataBase(String std_name, int std_id, long std_contact_no)
	{
		this.std_name = std_name;
		this.std_id = std_id;
		this.std_contact_no = std_contact_no;
	}
	@Override
	public String toString() {
		return "StudentDataBase [std_name=" + std_name + ", std_id=" + std_id + ", std_contact_no=" + std_contact_no
				+ "]";
	}
}
public class AppOfArrayList {
	public static void main(String[] args) 
	{	
		StudentDataBase std1 = new StudentDataBase("namitha",101,8123578130l);
		StudentDataBase std2 = new StudentDataBase("nishvika",102,9448664895l);
		ArrayList<Object> l1= new ArrayList<Object>();
		l1.add(std1);
		l1.add(std2);
		for(int i=0; i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		
	}
	
	
}
