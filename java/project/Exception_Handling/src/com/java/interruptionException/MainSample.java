package com.java.interruptionException;
class Sample
{
	public static void test(int num) throws InterruptedException
	{
		System.out.println("Execution starts..!!");
		Thread.sleep(10000);
		System.out.println("Execution ends..!!");
	}
}
public class MainSample {
	public static void main(String[] args) 
	{	
		try {
			Sample.test(10);
			Sample.test(20);
		}
		catch(InterruptedException ie)
		{
			System.out.println("Interrupted caused!!!");
		}
	}
}
