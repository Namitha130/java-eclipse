package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{	
	String empname;
	int id;
	long mob_no;
	public Employee(String empname, int id, long mob_no) 
	{
		this.empname = empname;
		this.id = id;
		this.mob_no = mob_no;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", id=" + id + ", mob_no=" + mob_no + "]";
	}
	
}
class EmpId implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1,Employee e2)
	{
		return e1.id - e2.id;
	}
}
public class SortingArrayList {
	public static void main(String[] args)
	{
		Employee emp1= new Employee("namitha",101,345678999987l);
		Employee emp2= new Employee("manitha",89,342345987l);
		Employee emp3= new Employee("nammi",56,987699987l);
		Employee emp4= new Employee("nishvika",11,34556799987l);
		ArrayList<Employee> li = new ArrayList<Employee>();
		li.add(emp1);
		li.add(emp2);
		li.add(emp3);
		li.add(emp4);
		Collections.sort(li.e1);
		li.forEach(obj -> System.out.println(obj));
	}
}
