package com.java.costomized;
import java.util.Scanner;
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str)
	{
		super(str);
	}
}
public class CustomizedException 
{
  public static void check(int age) throws InvalidAgeException
  {
	if(age<18)
	{
		throw new InvalidAgeException("oops!! sorry your not eligiblr for voting");
	}
	else
	{
		System.out.println("Great,user eligible to vote");
	}
  }
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your age to check if your eligible to vote or not");
	  int age = sc.nextInt();
	  try
	  {
		  check(age);
	  }
	  catch(InvalidAgeException i)
	  {
		  System.out.println("Caught the exception");
		  System.out.println("Exception occured "+ i);
	  }
  }
}
