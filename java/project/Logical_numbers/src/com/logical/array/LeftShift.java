package com.logical.array;

import java.util.Scanner;

public class LeftShift {
	public static  int[] shift(int[] num)
	{
		int[] res = new int[num.length];
		int x=num.length-1;
		for (int i=num.length-1; i>=0;i--)
		{
			if(num[i] != 0)
			{
				res[x]=num[i];
				x--;
			}
		}
		print(res);
		return res;
	}
	public static void print(int[] n)
	{
		for(int i=0; i<n.length;i++)
			
		{
			System.out.println(n[i]+"");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a size of an array");
		int size = scan.nextInt();
		int[] num = new int[size];
		System.out.println("Enter int elements");

		for(int i=0; i<num.length;i++)
		{
			num[i]=scan.nextInt();
		}
		shift(num);
	}

}
