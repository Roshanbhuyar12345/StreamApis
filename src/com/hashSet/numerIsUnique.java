package com.hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class numerIsUnique {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 96, 6, 4, 3 };
		HashSet<Integer> set = new HashSet<>();
		// preserve order
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			linkedHashSet.add(arr[i]);
		}
		System.out.println(set);
		System.out.println(linkedHashSet);
	}
}
