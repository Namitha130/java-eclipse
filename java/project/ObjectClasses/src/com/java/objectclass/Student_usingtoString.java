package com.java.objectclass;
class Student12
{
	String std_name;
	int std_id;
	long std_mob;
	public Student12(String std_name, int std_id, long std_mob) 
	{
		this.std_name = std_name;
		this.std_id = std_id;
		this.std_mob = std_mob;
	}
@Override
	public String toString() {
		return "Student [std_name=" + std_name + ", std_id=" + std_id + ", std_mob=" + std_mob + "]";
	}
}
public class Student_usingtoString 
{
	public static void main(String[] args)
	{
		Student12[] std= new Student12[3];
		std[0]= new Student12("Namitha",101,876543345l);
		System.out.println(std.toString());
	}
}
