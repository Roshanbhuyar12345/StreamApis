package com.arrays;

public class FibonacciSeries {

	// using recurtion

	public static void FabonacciUsingRecursion(int n) {

		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 1; i <= n; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}

	}

	public static void main(String[] args) {
		System.out.println();
		FabonacciUsingRecursion(10);
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
