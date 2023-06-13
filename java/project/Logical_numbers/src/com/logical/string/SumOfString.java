// find a sum of a numbers strings(each digit)

package com.logical.string;

public class SumOfString 
{	
	public static void sum(String str)
	{
		int sum=0;
		for(int i=0; i<str.length(); i++)
		{
			sum=sum+( str.charAt(i)-48);
			
		}
		//return sum;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{	
		//System.out.println(sum("12345"));
		sum("1234"); // 1+2+3+4=10
	}
}
