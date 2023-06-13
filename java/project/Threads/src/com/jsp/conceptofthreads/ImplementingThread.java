package com.jsp.conceptofthreads;
class MyThread implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("run() of MyThread class which implements "
				+ "the proprty from Runnable interface ");
	}
	
}
public class ImplementingThread {
	public static void main(String[] args) {
		MyThread m1= new MyThread();
		Thread t1 = new Thread(m1);
		//t1.run();
		t1.start();
	}
}
