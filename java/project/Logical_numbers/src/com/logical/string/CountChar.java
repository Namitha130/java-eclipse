// write a java program to count uppercase,lowercase 
//and special char in a  given string
package com.logical.string;

public class CountChar {
	public static void given (String str)
	{	
		int charCount=0;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i) <=90 
					||str.charAt(i)>=97 && str.charAt(i) <=122)
			{
				charCount++;
			}
		}
		System.out.println(charCount);
	}
	public static void main(String[] args) 
	{
	
		given("Namitha_TP");
	}

}
