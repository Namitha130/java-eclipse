package com.java.deadlockapplication;
class TotalEarning extends Thread
{
	int total=0;
	public void run()
	{	
		synchronized(this)
		{
			for(int i=1; i<=10; i++)
			{
				total = total+100;
			}
			this.notify();
		}
		
	}
	
}
public class DeadLockApplication 
{
	public static void main(String[] args) throws InterruptedException
	{
		TotalEarning t1= new TotalEarning();
		t1.start();
		synchronized(t1)
		{
			t1.wait();
		}
		System.out.println("Total amount is "+ t1.total+ "rs");
	}
}
