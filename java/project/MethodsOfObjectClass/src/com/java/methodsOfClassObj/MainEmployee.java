package com.java.methodsOfClassObj;

public class MainEmployee 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee("Namitha",27057,350000.00);
		Employee emp1 = new Employee("pooja",27057,450000.00);
//		emp.show_employee_details();  //display emp details
//		emp1.show_employee_details(); //display emp1 details
//		System.out.println(emp.hashCode()+ "  "+ emp1.hashCode());  //27057 and 27054
//		System.out.println(emp.toString()+ "  "+ emp1.toString());	// namitha   and pooja
		System.out.println(emp.equals(emp));
	}
}
