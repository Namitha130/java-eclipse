package com.java.propertiesOfExceptionHandling;
class Sample1
{
	public void testString(String str)
	{
		try {
			int a[]=new int [3];
			System.out.println(a[6]);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class StringException {
	public static void main(String[] args) 
	{
		Sample1 s = new Sample1();
		s.testString("hi");
	}
}
