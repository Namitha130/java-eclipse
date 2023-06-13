package com;

public class switch2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int choice;
		if (a > b) {
			choice = 0;
		} else if (a < b) {
			choice = 1;
		} else
			choice = 2;
		switch (choice)

		{
		case 0:
			System.out.println("Greater");
			break;

		case 1:
			System.out.println("Lesser");
			break;

		default:
			System.out.println("Equal");

		};
		
	}

}
