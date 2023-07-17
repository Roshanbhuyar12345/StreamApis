package com.arrays;

public class UsingWhileLoop {
	public static void main(String[] args) {

		int arr[] = { 7, 1, 3, 490, 490, 5, 6, 7, 8, 9 };

		int max = arr[0];
		int secondMax = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			if (arr[i] < max && secondMax < arr[i]) {
				secondMax = arr[i];
			}

		}

		System.out.println("Maximun number is " + secondMax);

	}
}
