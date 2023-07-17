package com.arrays;

import java.util.Arrays;

public class SecondHightNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 8, 90, 4, 2, 566, 558 };
		Arrays.sort(arr);
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			a = arr[arr.length - 2];

		}
		// System.out.println("Second Height no. " + a);
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);

		}
	}
}
