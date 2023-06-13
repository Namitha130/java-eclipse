package com.java.StringClass;
import java.util.Scanner;
public class String_Immutability {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String First_name = scan.next();
		System.out.println("Enter your last name");
		String last_name = scan.next();
		String s1= new String(" ");
		String full_name = First_name.concat(s1).concat(last_name);
		System.out.println(full_name);
//		System.out.println("------------Immutability String--------------");
//		String s1="Namitha";
//		String s2 = "TP";
//		s1.concat("T P ");
//		System.out.println(s1);//Namitha
//		s1= s1.concat("hello");
//		System.out.println(s1);//Namithahello
		
	}
}