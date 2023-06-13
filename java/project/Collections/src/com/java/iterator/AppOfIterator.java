package com.java.iterator;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class AppOfIterator {
	public static void main(String[] args) 
	{
		LinkedHashSet<Object> lh= new LinkedHashSet<Object>();
		lh.add(null);
		lh.add(134);
		lh.add(130);
		lh.add("namitha");
		Iterator<Object> itr= lh.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(lh.isEmpty());
	}
}
 