// java program to convert decimal to binary using number 
//(without storing as string)
package com.logical.Binary;

public class DecBinNumbers 
{
	public static void convert(int start, int end) {
		for (int k = start; k <= end; k++) {
			int res = 0;
			int j = 0;
			int temp = k;
			while (temp > 0) {
				int rem = temp % 2;
				res = rem * (int) Math.pow(10, j) + res;
				j++;
				temp = temp / 2;
			}	
			
	if (palindrome(k) && palindrome(res)) {
				System.out.println( k +" --> "+res);
			}
		}
	}

	public static boolean palindrome(int n) // 33
	{
		int number = n;
		int result = 0;
		while (n > 0) {
			int rem3 = n % 10;
			n = n / 10;
			result = result * 10 + rem3;
		}
		if (result == number) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		convert(1, 10);
	}
}
