package com;

public class unaryOperators {
	public static void main(String[] args) {

		int x = 10;
		int y = 5;

		System.out.println("---unary operators ---");
		int z = x++ + y++ + --y + ++y + ++x + ++y + x + y - x - y;
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);

		System.out.println("---Conditional operators ---");

		int a = 10;
		int b = 5;
		boolean c = a > b;
		System.out.println(c);
		boolean d = a < b;
		System.out.println(d);
		boolean e = a >= b;
		System.out.println(e);
		boolean f = a <= b;
		System.out.println(f);
		boolean g = a == b;
		System.out.println(g);
		boolean h = a != b;
		System.out.println(h);

		System.out.println("-------------------------");

		System.out.println(a > b); // t
		System.out.println(a < b); // f
		System.out.println(a >= b);// t
		System.out.println(a <= b);// f
		System.out.println(a == b);// f
		System.out.println(a != b);// t

		System.out.println("------------------");

		System.out.println(true);// t
		System.out.println(false);// f
		System.out.println(!true);// t
		System.out.println(!false);// t

		System.out.println("--Logical-OR operators ---");

		int p = 5;
		int q = 3;
		boolean r = p > q || p < q; // true

		System.out.println(r); // true
		System.out.println(10 < 5 || 10 < 5); // f

		System.out.println("---Logical -AND operators ---");

		int i = 5;
		int j = 5;

		boolean k = i < j && i < j;
		System.out.println("k is " + k); // false
		System.out.println(i == j && i < j);// false
		System.out.println(i == j && i == j);// true

		System.out.println("---Logical -NOT operators ---");
		int n = 26;
		int m = 23;

		System.out.println(!(n > m)); // !(true) = flase

		System.out.println("---Logical -ternary operators ---");

		System.out.println(n > m); // true
		System.out.println(n < m); // flase
		String result = (n >= m) ? "hi" : "bye";
		System.out.println(result);

	}

}
