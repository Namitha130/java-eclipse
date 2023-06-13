package com.java.propertiesOfExceptionHandling;
class Sample12
{
	public void test(int num)
	{
		try {
			int res= 100/num;
			System.out.println(res);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.out.println("------OR-----");
			Exception e1= new Exception();
			e1.printStackTrace();
			System.out.println(e);
			System.out.println("Invalid Operation!!!");
		}
	}
	
	
}
public class MainException 
{
	public static void main(String[] args) 
	{
		Sample12 s12= new Sample12();
		s12.test(100);
		s12.test(0);
		s12.test(10);
	}
}
