package com.arrays;

public class MaxNumber {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 6, 0, -2, 8, 4, 2, 5 };
		int max = 0;
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					max = arr[i];
					arr[i] = arr[j];
					arr[j] = max;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			min = arr[0];
		}
		System.out.println(min);
	}
}
