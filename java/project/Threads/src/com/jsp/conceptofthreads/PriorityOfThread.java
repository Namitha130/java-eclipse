package com.jsp.conceptofthreads;
class Mythread1 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Priority gives to this thread:"+ Thread.currentThread().getPriority());
	}
	

}
public class PriorityOfThread {
	public static void main(String[] args) 
	{
		Mythread1 m1= new Mythread1();
		
		Thread t1 = new Thread(m1);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.NORM_PRIORITY);
		t1.setPriority(3);//USER DEFINED PRIORITY
		t1.start();
	}
}
