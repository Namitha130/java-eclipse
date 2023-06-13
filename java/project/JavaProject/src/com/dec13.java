package com;

public class dec13 {
	public static void display(char alpha) {

		System.out.println("------pattern 1 ABC---");
		for (char i = 'A'; i <= alpha; i++) {
			for (char j = 'A'; j <= alpha; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

		System.out.println("----Pattern2   AAA BBB CCC----");
		for (char i = 'A'; i <= alpha; i++) {
			for (char j = 'A'; j <= alpha; j++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}

		System.out.println("----Pattern 3   ABCDEFGHI----");

		char a = 'A';
		for (char i = 'A'; i <= alpha; i++) {
			for (char j = 'A'; j <= alpha; j++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		display('C');
	}
}
