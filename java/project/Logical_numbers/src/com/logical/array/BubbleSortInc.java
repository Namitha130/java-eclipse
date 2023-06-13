package com.logical.array;

import java.util.Arrays;

public class BubbleSortInc 
{	
	
	public static int[] sort(int[] num)
	{	
		
		for(int i=0; i<=num.length-1;i++)
		{
			for(int j=0; j<=num.length-2;j++)
			{
				if(num[j] > num[j+1]) 
				{
					int temp=num[j];
					num[j] = num[j+1];
					num[j+1] =temp;
				}
			}
		}
	
		System.out.println(Arrays.toString(num));
		return num;
		
		
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,1,2,1,4,2,7,8,2};
		System.out.println(sort(num));
	}
}
