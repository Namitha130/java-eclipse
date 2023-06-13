package com.java.synchronizedmethod;

public class MainExtendingThread {
	public static void main(String[] args) {
		TestThread th = new TestThread();
		Mythread1 m1= new Mythread1(th);
		Mythread2 m2= new Mythread2(th);
		m1.start();
		m2.start();
	}
	
	
}
