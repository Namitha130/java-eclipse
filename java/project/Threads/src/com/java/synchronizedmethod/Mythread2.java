package com.java.synchronizedmethod;

public class Mythread2 extends Thread 
{
	TestThread t1;
	Mythread2 (TestThread t1)
	{
		this.t1=t1;
	}
	@Override
	public void run()
	{
		t1.div(5);
	}
}
