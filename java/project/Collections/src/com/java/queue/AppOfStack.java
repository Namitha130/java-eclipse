package com.java.queue;

import java.util.Stack;

public class AppOfStack {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(80);
		st.push(20);
		st.push(90);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		System.out.println(st.size());

	}
}
