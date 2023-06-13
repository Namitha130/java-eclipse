package com.java.propertiesofcollections;

import java.util.ArrayList;
import java.util.List;

//import java.util.*;

public class Sample {
	public static void main(String[] args) {
		List<Object> l1 =new ArrayList<Object>();
		l1.add("abc");
		l1.add(101);
		l1.add(2345678l);
		l1.add("werty");
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
//		l1.clear();
		l1.remove(0);//index value 0
		
		System.out.println(l1.isEmpty());//true or false
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		List<Object> l2 =new ArrayList<Object>(l1);
		System.out.println(l2.isEmpty()); //before adding it will be empty
		//l2.addAll(l1);
		l2.add(12);
		l2.add(234);
		l2.add(456);
		for(int i=0;i<l2.size();i++) 
		
		{
			System.out.println(l2.get(i));
		}
		System.out.println(l2);
		System.out.println(l2.get(6)); //will get 6th index value
	}
}

