package com;

public class forLooping {
	public static void main(String[] args) {

		System.out.println("----Example 1: Numbers from 1to 10----");

		for (int i = 1; i <= 10; i++) {
			System.out.println("numbers :" + i);
		}

		System.out.println("----Example 2: Even and odd numbers in 30----");

		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) // modules for even numbers
			{
				System.out.println("Even numbers: " + i);
			} else {
				System.out.println("odd numbers:" + i);
			}
		}

		System.out.println("----Example 3:  sum of even numbers from 1-30----");

		int sum = 0;
		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum of even numbers from 1-30 ");
		System.out.println(sum);
	}
}
