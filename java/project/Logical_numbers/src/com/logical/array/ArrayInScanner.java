package com.logical.array;
import java.util.Scanner;

public class ArrayInScanner 
{
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
		
	}
}
