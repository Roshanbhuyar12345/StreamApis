package com.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseNumer {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 5, 3, 5, 8, 3, 3);

		int arr[] = { 2, 4, 6, 8, 2, 5, 3, 5, 8, 3, 3 };

		int uniqueArray[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					uniqueArray[j] = -1;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (uniqueArray[i] != -1) {
				uniqueArray[i] = arr[i];
				System.out.print(" " + uniqueArray[i] + " ");
			}
		}
		List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		// System.out.println(collect);

		List<Integer> uniqueElement = list.stream().distinct().collect(Collectors.toList());
		System.out.println("\n" + uniqueElement);
	}

}
