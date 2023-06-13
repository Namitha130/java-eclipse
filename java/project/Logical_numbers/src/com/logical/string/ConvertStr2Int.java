// convert string to number value
package com.logical.string;

public class ConvertStr2Int 
{
	public static void convert(String str)
	{
		int sum=0;
		for(int i=0; i<str.length(); i++)
		{
			sum= sum*10 +str.charAt(i)-48;
		}
		
		System.out.println(sum);
	}
	public static void main(String[] args)
	{	

		convert("1235"); // 123
	}
}
