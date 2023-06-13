package com.java.synchronizedBlock;

public class Mythread1 extends Thread 
{
	TestThread t1;
	Mythread1(TestThread t1) {
		this.t1 = t1;
	}

	@Override
	public void run() {
		t1.div(100);
	}
}
