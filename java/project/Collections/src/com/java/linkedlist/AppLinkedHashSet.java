package com.java.linkedlist;

import java.util.LinkedHashSet;

public class AppLinkedHashSet {
	public static void main(String[] args) 
	{
		LinkedHashSet<Object> lh= new LinkedHashSet<Object>();
		lh.add(null);
		lh.add(134);
		lh.add(130);
		lh.add("namitha");
		for(Object obj:lh) 
		{
			System.out.println(obj);
		}
		System.out.println(lh.isEmpty());
	}
}
