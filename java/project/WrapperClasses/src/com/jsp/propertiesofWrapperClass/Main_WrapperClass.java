package com.jsp.propertiesofWrapperClass;

public class Main_WrapperClass {
	public static void main(String[] args) 
	{
		int a1= 10;
		Integer a2=a1;//autoboxing
		System.out.println(a1);
		System.out.println(a2);
		
		Double d1= (double) a1;
		System.out.println(d1);
		
		Integer i1=20;
		int i2=i1;
		System.out.println(i1);
		System.out.println(i2);
		
		Double b1 = new Double(20.5);
		double b2=b1;// unboxing
		System.out.println(b1);
		System.out.println(b2);
	}
}
