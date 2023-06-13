package com.encapsulation.ex2;

public class MainEncapsulation 
{	
	public static void main(String[] args)
	{	
		
		EmployeeAccount a1= new EmployeeAccount();
		System.out.println(a1.emp_name);
		a1.setContact_num(8123578130l);
		System.out.println(a1.getContact_num());
		a1.setEmp_id(27057);
		System.out.println(a1.getEmp_id());

		
	}
	
}
