package com.java.propertiesOfExceptionHandling;
import java.lang.Throwable;
class SampleMtMc extends Throwable {
	public void test(int num) {
		try {
			int ref = 100 / num;
			System.out.println(ref);
			
			try {
				int [] a=new int [4];
				System.out.println(a[6]);
			}
			catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1);
			}
		}
		catch ( ArithmeticException e1) {
			System.out.println(e1);
			System.out.println("Invalid operation!!");
		}
	}
}

public class MultipleTry_multi_catch 
{
	public static void main(String[] args) {
		SampleMtMc stc = new SampleMtMc();
		stc.test(100);
		stc.test(0);
		stc.test(10);
	}
}
