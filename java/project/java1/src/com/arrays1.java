
package com;

public class arrays1 {
	public static void main(String[] args) {
		int a1[]= {10,20,30,40,50,60};
		
		System.out.println(a1[1]); //20
		
		System.out.println(a1.length); // 6
		for(int i = 0; i <= a1.length - 1; i++) 
		{
			System.out.println(a1[i]); //10-60
			
		}
		System.out.println("---Fisrt bound---");
		System.out.println(a1[0]);
		System.out.println("---last bound---");
		System.out.println(a1.length-1);
		System.out.println(a1[a1.length-1]); // last bound
		System.out.println(a1[(a1.length-1)/2]); // middle bound
	}

}
