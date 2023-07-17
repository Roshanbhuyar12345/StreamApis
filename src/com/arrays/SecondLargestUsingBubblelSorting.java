package com.arrays;

public class SecondLargestUsingBubblelSorting {
	public static void main(String[] args) {
//second heighest using sortion
		int arr[] = { 2, 3, 4, 5, 6, 7, 22, 23, 8, 9, 10 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.err.println(arr[arr.length - 2]);
	}
}
