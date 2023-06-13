package com.java.vectors;

import java.util.Vector;

public class DemoVector {
	public static void main(String[] args)
	{
		Vector<Object> v1= new Vector<Object>(16,5);
//		Vector<Integer> v2= new Vector<Integer>();
		
		v1.add(0,101);
		v1.add(1,345);
		v1.add(2,null);
		v1.add(3,567);
		v1.add(4,"add");
		
		System.out.println(v1.size());//5
		
		for(int i=0; i < v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
		System.out.println(v1.capacity());//16
	}
}
