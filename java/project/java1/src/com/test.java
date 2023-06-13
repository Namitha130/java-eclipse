package com;

public class test {
	public static void display(int num) {

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++)

			{
				if (i % 2 != 0)
				{
					System.out.print(" * ");
				}
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		display(5);
	}

}
