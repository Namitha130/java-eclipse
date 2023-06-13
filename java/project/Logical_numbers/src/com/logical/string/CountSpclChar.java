//find a uppercase,lowercase,number and special char 
//count present in a string

package com.logical.string;

public class CountSpclChar {
	
	public static void given(String str)
	{	
		int upperCount =0;
		int lowerCount=0;
		int spclCount =0;
		int numeric=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i) <=90)
			{
				upperCount++;
			}
			else if(str.charAt(i)>=97 && str.charAt(i) <=122)
			{
				lowerCount++;
			}
			else  if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				numeric++;
			}
			else {
				spclCount++;
			}
		}
		System.out.println("uppercase count : "+upperCount);
		System.out.println("Lower case count : "+lowerCount);
		//System.out.println("numeric count: "+numeric);
		System.out.println("special char  count : "+ spclCount);
	}
	public static void main(String[] args) 
	{
		given("aaaAAA$*@_123");
	}

}
