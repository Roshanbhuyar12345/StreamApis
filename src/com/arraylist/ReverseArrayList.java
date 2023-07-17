package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayList {
	public static void main(String[] args) {

		List<Integer> emptyList = new ArrayList<>();
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		for (int i = num.size() - 1; i >= 0; i--) {
			emptyList.add(num.get(i));
		}
		System.out.println(emptyList);
	}
}
