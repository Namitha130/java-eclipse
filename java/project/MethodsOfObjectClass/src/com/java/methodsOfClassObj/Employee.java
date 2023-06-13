package com.java.methodsOfClassObj;

public class Employee {
	String ename;
	int e_id;
	double sal;
	public Employee(String ename, int e_id, double sal)
	{
		this.ename = ename;
		this.e_id = e_id;
		this.sal = sal;
	}
	public void show_employee_details()
	{
		System.out.println(ename+" "+ e_id+ " "+ sal);
	}
	@Override
	public int hashCode()
	{
		return e_id;
	}
	@Override
	public String toString()
	{
		return ename + " "+sal;
	}
	@Override
	public boolean equals(Object obj)
	{
		return this.e_id == obj.hashCode();
	}
}
