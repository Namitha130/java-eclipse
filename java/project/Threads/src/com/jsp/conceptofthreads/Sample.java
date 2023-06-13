package com.jsp.conceptofthreads;

public class Sample extends Thread
{
	@Override
	public void run()
	{
		System.out.println("HIII");
	}
	public static void main(String[] args) {
		Sample s1= new Sample();
		s1.run();
		//s1.start();
		System.out.println(s1.currentThread());
	}
}
