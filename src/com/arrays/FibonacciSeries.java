package com.arrays;

public class FibonacciSeries {

	// using recurtion
	static int a = 0;
	static int b = 1;
	static int c = 0;

	public static void FabonacciUsingRecursion(int n) {

		if (n > 0) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;

			FabonacciUsingRecursion(n - 1);
		}

	}

	public static void main(String[] args) {

		int n = 10;
		FabonacciUsingRecursion(n);
	}

}

// 1+1+2+3+5+8

//int a = 0, b = 1, c = 0;
//for (int i = 0; i < 10; i++) {
//	c = a + b;
//	System.out.println(c);
//	a = b;
//	b = c;
//}
