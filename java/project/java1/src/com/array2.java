package com;

public class array2 
{
//	public static void main(String[] args)
//	{
//	int a1[]= {2,4,6,8,10};
//	
//	int [] a2 = new int[a1.length];  // new array 
//	for(int i = 0; i <= a2.length - 1; i++) 
//	{
//		a2[i] = a1[i];
//		System.out.println("a2[i] is "+ a2[i]); 
//	}
//	}
	public static void testarray(int [] arr)
	{
		for(int i = 0 ; i <= arr.length-1 ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) 
	{
	int[] input = { 1 , 2, 3, 4, 5};
	testarray(input);
	System.out.println("------ example 2 : Array-----");
	int[] input1 = { 10 ,20, 30, 40, 50};
	testarray(input1);
	}
	
}
	


