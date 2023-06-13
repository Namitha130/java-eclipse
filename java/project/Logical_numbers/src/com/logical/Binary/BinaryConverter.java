//write a java program to print binary value is palindrome 
//or not within the range
package com.logical.Binary;

public class BinaryConverter {

	public static void converter(int start, int end) {
		for (int i = start; i <= end; i++) {
			int temp = i;
			String rem1 = "";
			String rem2 = "";
			while (temp > 0) {
				int rem = temp % 2; // 1%2 ==1
				rem1 = rem + rem1; // correct order
				rem2 = rem2 + rem; // reverse order
				temp = temp / 2;
			}
			// System.out.println(rem2);
			if (rem1.equals(rem2)) {
				System.out.print(i + " ");

			}
		}
	}

	public static void main(String[] args) {
		converter(10, 100);

	}

}
