package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MurgingTwoArrays {

	public static void main(String[] args) {

		int arr1[] = { 1, 0, 2, 7, 9 };
		int arr2[] = { 3, 5, 6, 8, 1 };

		int arr3[] = new int[arr1.length];
		int arr4[] = new int[arr2.length];

		List<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < arr1.length; i++) {
			numbers.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			numbers.add(arr2[i]);
		}
		int a = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (i < 5) {
				arr4[i] = numbers.get(i);
			} else {
				arr3[a] = numbers.get(i);
				a++;
			}
		}
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));

	}
}
