package com.java.lucknum;

public class Luckynum {
	public static boolean check(int num) // 123
	{
		int sum = 0;
		while (num > 0) {
			int rem = num % 10; // (123%10) 3
			sum = sum + rem; // 0+3
			num = num / 10; // 123/10 =12
		}
		if (sum > 9) {
			return check(sum);
		}
		else if (sum == 1) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(check(123));
		System.out.println(check(10));
	}
}
