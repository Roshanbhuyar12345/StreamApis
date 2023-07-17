package com.map.interf;

import java.util.HashMap;
import java.util.Map;

public class StringFrequency {
	public static void main(String[] args) {

		String str = "engineer";
//		int count = 1;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		map.forEach((a, b) -> System.out.println("Charecter  :" + a + " " + "Count " + b));

	}
}
