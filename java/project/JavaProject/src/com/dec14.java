package com;

public class dec14 {
	public static void display(int num) 
	{
		System.out.println("---- Pattern 1: 111 11 1 ----");
		
		
		for (int i = 1; i <= num; i++) 
		{
			for (int j = 3; j >= i; j--)
			{
				System.out.print(" 1 ");
			}
			System.out.println(" ");
		}

		System.out.println("----- Pattern 2: 1 11 111---");

		for (int i = 1; i <= num; i++) 
		{
			for (int s = 2; s >= i; s--)  
			{
				System.out.print("   ");
			}
			for (int j = 1; j <= i; j++)
			
			{
				System.out.print(" 1 ");                                                              
			 }
			System.out.println(" ");
		} 

	}

	public static void main(String[] args) {
		display(3);

	}
}