package com.logical.array;

import java.util.Scanner;
public class SortIncrement
{	
	
	public static void sorting(int[] a)
	{
		for(int i=0 ; i< a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if (a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int k= 0 ; k <a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
	public static void main(String[] args) 
	{
		//Scanner scan = new Scanner(System.in);
		int [] a = {1,5,4,2,3};
		sorting(a);
		
	}
		
	
}
