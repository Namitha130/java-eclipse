package com.java.maps;

public class LinkedHashMap 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> lh = new LinkedHashMap<Integer,String>();
		lh.put(101, "Namitha");
		lh.put(104, "Kishu");
		lh.put(102, "Nishvika");
		lh.put(103, "Shailaja");
		lh.put(101, "Nammi");
		System.out.println(lh);
		System.out.println(lh.get(103));
		
	}
}
