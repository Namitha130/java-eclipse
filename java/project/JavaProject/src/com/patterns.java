package com;

public class patterns {
	public static void display(int num) {

		System.out.println("----pattern 1: 123456789 ---");
		int a1 = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(a1 + " ");
				a1++;

			}
			System.out.println(" ");
		}

		System.out.println("---- pattern 2: 987654321 ---");
		int a2 = 9;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(a2 + " ");
				a2--;

			}
			System.out.println(" ");
		}

		System.out.println(" ------ pattern3:  2 4 6 8 10 12 14 16 18 -----");

		int a3 = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(a3 * 2 + " ");
				a3++;

			}
			System.out.println(" ");
		}

		System.out.println("--- Pattern 4: 1 0 1 ------");

		int a4 = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(a4 % 2 + " ");
				a4++;

			}
			System.out.println(" ");
		}

		System.out.println("-----pattern 5: 0 1 0 ---");

		a1 = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(a1 % 2 + " ");
				a1++;

			}
			System.out.println(" ");
		}
		System.out.println("---- pattern 6: 111 222 333  ---- ");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}

		System.out.println("---- pattern 7: 123 123 123---- ");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(j + " ");

			}
			System.out.println(" ");
		}

		System.out.println("--- PATTERN 8: 1 22 333 ---");

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		display(3);

	}
}
