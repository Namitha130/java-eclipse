package com.scan.methodOfclassobj;
import java.util.Scanner;
public class MainEmployee {

	public static void main(String[] args) 
	{	System.out.println("Employee datils are:");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee name:");
		String name = scan.next();
		System.out.println("Enter employee Id");
		int id = scan.nextInt();
		System.out.println("Enter employee salary");
		double sal=scan.nextDouble();
		
		Employee emp = new Employee(name,id,sal);
		System.out.println(emp.toString());
		
		System.out.println("Another Employee datils are:");
	
		System.out.println("Enter employee name:");
		String name1 = scan.next();
		System.out.println("Enter employee Id");
		int id1 = scan.nextInt();
		System.out.println("Enter employee salary");
		double sal1=scan.nextDouble();
		
		Employee emp1 = new Employee(name,id,sal);
		System.out.println(emp1.toString());
		
	}
}
