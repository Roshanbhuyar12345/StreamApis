package com.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArraysProblem {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 40, 50, 60, 70, 80, 90 };

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {
					list.add(arr1[i]);
				}

			}

		}
		System.out.println(list);

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {

			set.add(arr1[i]);

		}
		for (int i = 0; i < arr2.length; i++) {

			set.add(arr2[i]);

		}
		System.out.println(set);
	}
}
