package com;

public class pyramid {
	public static void test(int n) 
	{
		System.out.println(" Pattern 1:  pyramid ----");	
		for (int i = 1; i <= n; i++)
		{
			for (int s = n - 1; s >= i; s--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	
	
System.out.println(" Pattern 2: Reverse pyramid ----");	
		for (int i = 1; i <= n; i++)
		{
			for (int s = 1; s <= i; s++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= n- i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	}

	public static void main(String[] args) {
		test(5);
	}
}


