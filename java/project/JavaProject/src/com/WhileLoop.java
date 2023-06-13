package com;

public class WhileLoop
{
	public static void test(int num) 
	{
		
		System.out.println("---- print hello world 5 times---");
		int i = 1;
		while (i <= num) 
		{
			System.out.println("Hello world");
			i++;
		}

//		System.out.println("---- print hello world infinite times---");
//	
//			 int k = 1;
//			 while (k <= num)
		{
//			System.out.println("Hii ");
//		}
		
		 
			
		System.out.println("---- print 1 to 100 natural numbers---");
		int j = 1;
		while (j <= num)
		{
			System.out.println(j);
			j++;
		}
		
	}
}
	public static void main(String[] args) {
		test(5);
		
	}

}
