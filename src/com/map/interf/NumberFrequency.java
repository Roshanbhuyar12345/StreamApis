package com.map.interf;

import java.util.HashMap;
import java.util.Map;

public class NumberFrequency {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 3, 6, 4, 4, 3, 6, 6 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {

			if (map.containsKey(numbers[i])) {
				map.put(numbers[i], map.get(numbers[i]) + 1);
			} else {
				map.put(numbers[i], 1);
			}

		}
		long start = System.currentTimeMillis();
		map.forEach((a, b) -> System.out.println(a + "      = " + b));
		long end = System.currentTimeMillis();
		System.out.println("Exicution time in millisecond :" + (end - start));

	}
}
