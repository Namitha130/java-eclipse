//write a java program to repeat a alphabet as many times the number is next to that alphabet.
//eg =>  i/p nam2b4s2 ===> nammbbbbss 
package com.logical.string;

import java.util.Scanner;

public class NConcat 
{	
	public static String concat(String str)
	{
		String res="";
		for(int i=0 ; i<str.length();i++)
		{
			if(str.charAt(i)>=48 && str.charAt(i) <=57)
			{
				for(int j=1;j<(str.charAt(i)-48);j++)
				{
					res=res+str.charAt(i-1);
				}
			}
			else	
			{
				res=res+str.charAt(i);
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string:");
		String str =sc.nextLine();
		System.out.println(concat(str));
	}
}
