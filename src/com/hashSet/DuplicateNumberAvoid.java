package com.hashSet;

import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateNumberAvoid {
	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 3, 4, 6, 1 };

		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			Boolean key = false;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					key = true;

				}
			}
			if (key) {

				list.add(arr[i]);

			}
		}

		System.out.println(list);

	}
}
