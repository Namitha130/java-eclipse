package com.logical.Binary;

public class BinaryDecArray {
	public static int binaryToDecimal(int[] num)
	{
		int res = 0;
		int j = 0;
		for(int i=num.length-1;i>=0;i--)
		{
			int rem = num[i]%10;
			res = res + (int) Math.pow(2,j)*rem;
			j++;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		
		int[] arr = new int[]{1,1,0,0,1};
		//int[] arr1 = new int[] {1,1,1,1};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println(binaryToDecimal(arr));
	}

}
