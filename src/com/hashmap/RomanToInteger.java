package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();

		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		try {
			RomanToInteger.getRomanNumToItsValue(map, "MCMXCIV");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int getRomanNumToItsValue(Map<Character, Integer> map, String romanNum) {

		int num = 0;

		for (int i = 0; i < romanNum.length(); i++) {

			char ch = romanNum.charAt(i);

			if (i < romanNum.length() - 1 && map.get(romanNum.charAt(i)) < map.get(romanNum.charAt(i + 1))) {
				num = num - map.get(ch);
			} else {
				num = num + map.get(ch);

			}

		}

		System.out.println(num);
		return num;
	}

}
