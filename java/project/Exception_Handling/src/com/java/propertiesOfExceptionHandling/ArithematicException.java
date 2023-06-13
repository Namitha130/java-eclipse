package com.java.propertiesOfExceptionHandling;

class Sample {
	public void arithematic(int num) {

		try {
			int res = 100 / num;
			System.out.println(res);
		} catch (Exception e) {
			System.out.println("Invalid operation!!");
		}

	}
}

public class ArithematicException {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.arithematic(100);
		s1.arithematic(0);
		s1.arithematic(10);
	}
}
