package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberInList {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();

		// by using stream api

		List<Integer> evenNum = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("Using stream " + evenNum);

		// by using for loop
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				evenList.add(list.get(i));
			} else {
				oddList.add(list.get(i));
			}
		}
		System.out.println("Even number list " + evenList);
		System.out.println("Odd number list " + oddList);

	}

}
