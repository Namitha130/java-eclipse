package com.java.queue;

import java.util.PriorityQueue;

public class AppOfPriorityQueue {
 public static void main(String[] args) 
 {
	PriorityQueue pq = new PriorityQueue();
	pq.add(50);
	pq.add(40);
	pq.add(10);
	pq.add(20);
	pq.add(60);
	
	for(int i=0 ; i<= pq.size();i++)
	{
		System.out.println(pq.poll());
	}
	
 }
}
