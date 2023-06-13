package com.logical.string;

import java.util.Scanner;

public class AlphabetRepeat {
	public static String concat(String str,int n)
	{
		String res ="";
		for(int i=0 ; i<str.length();i++)
		{
			for(int j=1; j<=n;j++)
			{
				res=res+str.charAt(i);
			}
		}
		return res;
		
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string :");
		String s1=scan.nextLine();
		System.out.println("enter n value:");
		int n= scan.nextInt();
		
		System.out.println(concat(s1,n));

	}

}
