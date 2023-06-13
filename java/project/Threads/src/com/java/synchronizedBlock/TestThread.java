package com.java.synchronizedBlock;

public class TestThread {

	 public void div(int num)
	 {	
		 synchronized(this)
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
}
