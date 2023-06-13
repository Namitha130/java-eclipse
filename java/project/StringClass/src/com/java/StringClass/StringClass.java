package com.java.StringClass;

public class StringClass {
	public static void main(String[] args) {
		String s1= "hii";
		String s2 = "hii";
		String s3= new String("Hello");
		String s4= new String("Hello");
		System.out.println(s1 == s2);// true
		System.out.println(s1.equals(s2));//true
		System.out.println(s3 == s4); // false
		System.out.println(s3.equals(s4));//true
	}
}
