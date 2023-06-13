//write a java program to convert decimal to binary using array
// method:2
package com.logical.Binary;

public class DecBinaryArr2 {
	public static int[] convert(int num) {
		int size = 0;
		int temp = num;
		while (temp > 0) {
			int rem = temp % 2;
			size++;
			temp = temp / 2;
		}

		int[] arr = new int[size];
		int i = arr.length - 1;
		while (num > 0) {
			int rem = num % 2;
			arr[i] = rem;
			i--;
			num = num / 2;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		return arr;

	}

	public static void main(String[] args) {
		convert(35);
	}

}
