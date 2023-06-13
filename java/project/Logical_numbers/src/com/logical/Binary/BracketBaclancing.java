package com.logical.Binary;

import java.util.Scanner;
import java.util.Stack;

public class BracketBaclancing 
{	
	public static String check(String str)
	{
		if(str.length( ) %2 == 1)
		 {
			 return "NO";
		 }
		 Stack<Character> s1 = new Stack<Character>();
		 for(int i=0; i<=str.length()-1 ;i++)
		 {
			 if(str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(' )
			 {
				 s1.push(str.charAt(i));
			 }
			 else if(!s1.empty() && (str.charAt(i) == '}' && s1.peek()=='{' 
					 || str.charAt(i) == ']' && s1.peek()=='['
					 || str.charAt(i) == ')' && s1.peek()=='('))
					 {
				 		s1.pop();
					 }
			 else {
				 s1.push(str.charAt(i));
			 }
		 }
		 if(s1.isEmpty())
		 {
			 return "YES";
		 }
		return "No";
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer String : ");
		String str = scan.next();
		System.out.println(check(str));
		scan.close();
	}
}
