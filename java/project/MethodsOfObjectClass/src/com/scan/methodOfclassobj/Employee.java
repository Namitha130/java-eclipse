package com.scan.methodOfclassobj;

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
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", e_id=" + e_id + ", sal=" + sal + "]";
	}
}
