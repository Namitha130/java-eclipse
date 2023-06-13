package com;

public class nestedForLooping {
	public static void main(String[] args) {

		// PATTERN 1
		System.out.println("--- * PATTERN 1  ---");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		// PATTERN 2
		System.out.println("--- * PATTERN 2 ---");

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}

		// PATTERN 3
		System.out.println("--- PATTERN 3 ---");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}

		// PATTERN 4
		System.out.println("--- PATTERN 4 ---");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

		// abcde PATTERN 5
		System.out.println("---ABCDE PATTERN 5 ---");
		for (char i = 'a'; i <= 'e'; i++) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

		// abcde PATTERN 6
		System.out.println("---ABCDE PATTERN 6 ---");
		for (char i = 'a'; i <= 'e'; i++) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}

	}

}
