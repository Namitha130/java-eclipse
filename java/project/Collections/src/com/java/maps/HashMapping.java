package com.java.maps;

import java.util.HashMap;

public class HashMapping {
	public static void main(String[] args) {
		HashMap<Integer, String> hp = new HashMap<Integer, String>();
		hp.put(101, "Namitha");
		hp.put(104, "Kishu");
		hp.put(102, "Nishvika");
		hp.put(103, "Shailaja");
		hp.put(101, "Nammi");
		System.out.println(hp);
		System.out.println(hp.get(103));

	}
	
}
