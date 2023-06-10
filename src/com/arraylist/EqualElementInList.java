package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class EqualElementInList {
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(4, 5, 6, 7, 8, 9);
		List<Integer> list2 = Arrays.asList(11, 12, 13, 6, 7, 8);
		List<Integer> duplicateElemet = new ArrayList<>();

		List<Integer> addTwoList = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			addTwoList.add(list1.get(i));
			addTwoList.add(list2.get(i));
		}
		HashSet<Integer> removeDuplicateElementInList = new HashSet<>(addTwoList);

		System.out.println("Unique element in two list" + removeDuplicateElementInList);

		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i) == list2.get(j)) {
					duplicateElemet.add(list1.get(i));
				}

			}
		}
		System.out.println("Duplicate element in two list " + duplicateElemet);
	}

}
