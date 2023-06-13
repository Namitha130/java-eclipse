package com.java.propertiesOfExceptionHandling;
class SampleArray
{
	public void arrayException(int []arr) 
	{
		try {
			for(int i=0; i<=5;i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(Exception a)
		{
			System.out.println("Invalid operation");
		}
		
	}
}
public class ArrayIndexOutOfBoundsException {
	
	public static void main(String[] args) {
		SampleArray s1 = new SampleArray();
		int[] input1= {1,2,3,4,5};
		s1.arrayException(input1);
		
	}
}
