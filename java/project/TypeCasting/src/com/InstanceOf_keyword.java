package com;

class Sample {
	public void test() {
		System.out.println("I'm a test()");
	}
}

class Demo extends Sample {
	public void display() {
		System.out.println("I'm a display()");
	}
}

public class InstanceOf_keyword {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		System.out.println(s1 instanceof Sample);// true
		System.out.println(s1 instanceof Demo);// false

		Sample d1 = new Demo();
		System.out.println(d1 instanceof Demo);// true
		System.out.println(d1 instanceof Sample);// false
	}

}
