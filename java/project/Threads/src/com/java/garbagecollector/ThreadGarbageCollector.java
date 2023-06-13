package com.java.garbagecollector;

public class ThreadGarbageCollector {
	public void finalize()
	{
	System.out.println("finalize method");	
	}
//	public static void gc()
//	{
//		System.out.println("gc method");
//	}
	public static void main(String[] args) 
	{
		ThreadGarbageCollector g1 = new ThreadGarbageCollector();
		g1=null;
//		g1.gc();
		System.gc();
		
	}
}
