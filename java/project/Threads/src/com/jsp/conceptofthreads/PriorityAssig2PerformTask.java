package com.jsp.conceptofthreads;
class Demo extends Thread
{
	@Override
	public void run()
	{
		for(int i=1 ; i<=5 ;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Priority assigned to perform task:"+ Thread.currentThread().getPriority());
		System.out.println("----------------------------");
	}
}
public class PriorityAssig2PerformTask {

	public static void main(String[] args) {
		Demo d1= new Demo();
		Demo d2= new Demo();
		d1.setPriority(Thread.MIN_PRIORITY);
		d2.setPriority(Thread.MAX_PRIORITY);
		d1.start();
		d2.start();
	}

}
