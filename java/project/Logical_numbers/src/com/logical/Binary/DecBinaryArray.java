//write a java program to convert decimal to binary using array
// method:1
package com.logical.Binary;

public class DecBinaryArray 
{	public static int[] check(int num)
	{
		int[] arr = new int[32];
		int i =0;
		while(num>0)
		{
			int rem= num%2;
			arr[i] = rem;
			i++;
			num=num/2;
		}
		for(int j= i-1; j>=0;j--)
		{
			System.out.print(arr[j] + " ");
		}
		return arr;
		
	
	}
			
	public static void main(String[] args) 
	{
		check(35);
	}
}


