package com.java.synchronizedmethod;

public class TestThread {
 synchronized public void div(int num)
 {
	 for(int i=1;i<=5;i++)
	 {
		 System.out.println(num/i);
		 try {
			 Thread.sleep(1000);
		 }
		 catch(Exception e)
		 {
			System.out.println(e); 
		 }
	 }
 }
}
