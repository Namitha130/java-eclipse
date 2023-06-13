package com.scan.ex1;
import java.util.Scanner;
public class ReadInput 
{	
	int a1;
	String s1;
	// creating construtor for variable a1,s1(for initialize the variable
	public void ReadInput(int a1, String s1) 
	{
		this.a1 = a1;
		this.s1 = s1;
	}
	//creating method to passing variable
	public void show(int a1,String s1)
	{
		this.a1=a1;
		this.s1=s1;
		System.out.println(a1+" "+ s1);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter Inputs:");
		Scanner scan= new Scanner(System.in);
		int i1 = scan.nextInt();
		String str =scan.next();
		ReadInput read = new ReadInput();
		read.show(i1,str);
		}
}
