package com.logical.array;

import java.util.Scanner;

public class EvenLeftOddRight 
{	
	public static void evenOdd(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		int[] even=new int[count];
		int[] odd=new int[arr.length-count];
		int k=0;
		int z=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even[k]=arr[i];
				k++;
			}
			else {
				odd[z]=arr[i];
				z++;
			}
		}
		sortIncrement(even);
		sortDecrement(odd);
	}
	public static int[] sortIncrement(int[] even ) 
	{
		for(int i=0;i<even.length;i++) {
			for(int j=i+1;j<even.length;j++) {
				if(even[i]>even[j]) {
					int temp=even[i];
					even[i]=even[j];
					even[j]=temp;
				}
			}
			System.out.print(even[i]+" ");
		}
		return even;
	}
	public static int[] sortDecrement(int[] odd) 
	{
		for(int i=odd.length-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(odd[i]<odd[j]) {
					int temp=odd[i];
					odd[i]=odd[j];
					odd[j]=temp;
				}
			}
			System.out.print(odd[i]+" ");
		}
		return odd;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the integer elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Array elements after sorting");
		evenOdd(arr);		
		sc.close();
	}
}
