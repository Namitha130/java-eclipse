package com.java.maps;

import java.util.TreeMap;

public class TreeMapping 
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> tp = new TreeMap<Integer,String>();
		tp.put(101, "Dinga");
		tp.put(89, "Dingu");
		tp.put(101, "Dingii");
		tp.put(103, "Rangu");
		tp.put(67, "Manitha");
		tp.put(101, "Kushii");
		System.out.println(tp);
		System.out.println(tp.descendingKeySet());
		System.out.println(tp.descendingMap());
		System.out.println(tp.get(103));
	}
}
