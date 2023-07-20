package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElementInArrays {
	public static void main(String[] args) {

		// int arr[] = { 1, 2, 2, 3, 4, 5, 6, 4, 6, 7, 9, 7 };
//the time complecity of code is O(n)2
		List<Integer> asList = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 4, 6, 7, 9, 7);
		List<Integer> empltyList = new ArrayList<>();
		List<Integer> unique = new ArrayList<>();

		for (int i = 0; i < asList.size(); i++) {
			for (int j = i + 1; j < asList.size(); j++) {
				if (asList.get(i) == asList.get(j)) {

					empltyList.add(asList.get(i));

				}
			}
		}
		System.out.println(empltyList);

		for (int i = 0; i < asList.size(); i++) {

			if (!empltyList.contains(asList.get(i))) {
				empltyList.add(asList.get(i));
			} else {
				unique.add(asList.get(i));
			}

		}
		System.out.println(unique);

//		int dulpcateElement[] = new int[arr.length];
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					dulpcateElement[j] = -1;
//				}
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if (dulpcateElement[i] == -1) {
//				System.out.println(arr[i]);
//			}
//
//		}

	}
}
