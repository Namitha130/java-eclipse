package com.encapsulation.ex2;

public class EmployeeAccount {
	String emp_name = "Namitha T P";
			private long contact_num;
			private int emp_id;
			
	public void setContact_num(long contact_num) 
	{
		this.contact_num = contact_num;
	}
	public long getContact_num()
	{
		return contact_num;
	}
	
	public void setEmp_id(int emp_id) 
	{
		this.emp_id = emp_id;
	}
	public int getEmp_id() {
		return emp_id;
	}
//public static void main(String[] args) 
//{
//	EmployeeAccount a1= new EmployeeAccount();
//	System.out.println(a1.emp_name);
//	System.out.println(a1.getContact_num());
//	a1.setContact_num(8123578130l);
//	System.out.println(a1.contact_num);
//	System.out.println("------------");
//	System.out.println(a1.getEmp_id());
//	a1.setEmp_id(27057);
//	System.out.println(a1.emp_id);
//	
//	
//}	

}
