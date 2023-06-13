// write a java program to print number which are palindrome
//as well as their binary  numbers are also palindrome

package com.logical.Binary;

public class BinaryPalindrome {
	
	public static void covert(int start,int end)
	{
		for(int i=start;i <=end ;i++)
		{
			if(helper(i) ==true && palindrome(i)== true)
			{
				System.out.println(i);
			}
		}
	}
	public static boolean palindrome(int n) //33
	{
		int number=n;
		int result =0;
		while(n>0)
		{
			int rem3=n%10; 
			n=n/10;
			result=result*10+rem3;
		}
		if(result ==number)
		{
			return true;
		}
		return false;
	}
	//to check binary value
	public static boolean helper (int num) 
	{
		String rem1 = "";
		String rem2 = "";
		while (num > 0) 
		{
			int rem = num % 2;
			rem1 = rem1 + rem;
			rem2 = rem + rem2;
			num = num / 2;
		}
	
		if (rem1.equals(rem2))
		{
			return true;
		}
		return false; 

	}
	public static void main(String[] args) 
	{
		covert(10,999);
	}
	

}
