package com.java.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class HashSet {
	public static void main(String[] args) {
		List<Object> l1 = new ArrayList<Object>();
		l1.add("abc");
		l1.add(101);
		l1.add(234567234568l);
		l1.add("werty");
		l1.add(null);
		l1.add(null);
		System.out.println(l1);

		HashSet<Object> h1 = new HashSet(l1);
		h1.add(10);
		h1.add("null");
		for(Object obj: h1) {
			System.out.println(obj);
		}
		System.out.println(h1.isEmpty());
	}

}
