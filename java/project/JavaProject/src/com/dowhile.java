package com;

public class dowhile {
	
	public static void test(int a) 
	{
//		System.out.println("----hello word in infinite times---");
//		int i = 1;
//		do {
//			System.out.println(" Hello World");
//		} while (i <= a);
	
	
	System.out.println("----series of numbers 1----");

		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= a);

	
	}
	public static void main(String[] args) {
		test(10);
	
	}
	
	

}
