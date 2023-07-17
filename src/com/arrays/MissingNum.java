package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class MissingNum {
	public static void main(String[] args) {

		String str = "shubhambirari";
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		map.forEach((a, b) -> System.out.println("Char " + a + "  " + "Frequency " + b));

//		int sum = 0;
//		int sum1 = 0;
//		for (int i = 1; i <= num.length + 1; i++) {
//			sum = sum + i;
//		}
//		for (int i = 0; i < num.length; i++) {
//			sum1 = sum1 + num[i];
//		}
//
//		System.out.println("Missing element in array is " + (sum - sum1));
	}
}
