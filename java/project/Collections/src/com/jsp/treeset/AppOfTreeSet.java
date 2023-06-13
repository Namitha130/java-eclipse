package com.jsp.treeset;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class AppOfTreeSet 
{
	public static void main(String[] args) 
	{
		SortedSet<Integer> s1= new TreeSet<Integer>();
		s1.add(30);
		s1.add(20);
		s1.add(40);
		s1.add(60);
		s1.add(50);
		s1.add(5);
		System.out.println("-------Ascending Order-------");
		System.out.println(s1);
		TreeSet<Object> t1 = new TreeSet<Object>(s1);
		t1.add(100);
		t1.add(70);
		t1.add(65);
		t1.add(15);
		try
		{
			t1.add(null);
			t1.add("manitha");
		}
		catch(Exception e)
		{
			System.out.println("Invalid Exception");
		}
//		t1.add(null);//throws null pointer exception
//		t1.add("manitha");//throws classCast exception
		System.out.println(t1);
		System.out.println("-------Search and retrieving the data using  lambda function-------");
		t1.forEach(obj -> System.out.println(obj)); // retrieving the data using lambda function
		NavigableSet<Object> t3 =new TreeSet<Object>(t1);
		System.out.println("-------Descending Order-------");
		System.out.println(t1.descendingSet());
		System.out.println("-----Search and print by using forEach lambda-------");
		
	}
}
