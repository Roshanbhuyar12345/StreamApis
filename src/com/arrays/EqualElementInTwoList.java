package com.arrays;

import java.util.LinkedList;

public class EqualElementInTwoList {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(40);
		list2.add(50);
		list2.add(60);
		list2.add(70);
		list2.add(80);

		LinkedList<Integer> emptyList = new LinkedList<>();
		for (int i = 0; i < list1.size(); i++) {

			for (int j = 0; j < list2.size(); j++) {

				if (list1.get(i) == list2.get(j)) {
					emptyList.add(list1.get(i));
				}

			}

		}
		System.out.println("These are the equal elements in arraylist " + emptyList);

	}
}
