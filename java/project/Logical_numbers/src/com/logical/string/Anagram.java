// write a java program to check the given string are anagram or not
// 1. check length a) equal => step 2
//					b) not equal +> return false

//2  convert given string to either lower or upper case
//3. connvert both string to char[]
//4  sort both array
//5  compare each index character of both arrays
// a) all are equal ---> return true;
// b) any one not equal --> false;
package com.logical.string;
import java.util.*;

public class Anagram {
	public static String check (String s1 , String s2)
	{
		//step1
		if(s1.length() != s2.length())
		{
			return "Both string are not equal";
		}
		//step2
		s1= toLowerCase(s1);
		s2 = toLowerCase(s2);
		//System.out.println(s1+   " " +s2);
		//step3
		char[] c1 = toCharArray(s1);
		char[] c2 = toCharArray(s2);
		//step 4
		sort(c1);
		sort(c2);
		for(int i =0 ;i <c1.length;i++)
		{
			if(c1[i] != c2[i])
			{
				return "Not Anagram";
						
			}
		}
		return "Yes both strings are Anagram";
			
	}

	// step2
	public static String toLowerCase(String str) {
		String res = " ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				res = res + str.charAt(i);
			} else {
				res = res + (char) (str.charAt(i) + 32);

			}
		}
		return res;
	}

	// step3
	public static char[] toCharArray(String str) {
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		return ch;

	}

	// step4
	public static char[] sort(char[] ch) {
		for (int i = 0; i <= ch.length - 1; i++) 
		{
			for (int j = 0; j <= ch.length - 2; j++) 
			{	
				if(ch[j] >ch[j+1])
				{
				int temp = ch[j];
				ch[j] = ch[j + 1];
				ch[j + 1] = (char) temp;
				}
			}
		}
		return ch;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1 string :");
		String s1 = sc.next();
		System.out.println("Enter s2 string :");
		String s2 = sc.next();
//		System.out.println(check("abcsw" ,"ABWS"));
		System.out.println(check(s1,s2));
		
	}

}
