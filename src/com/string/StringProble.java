package com.string;

import java.util.HashMap;
import java.util.Map;

//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
public class StringProble {
//	int I = 1;
//	int V = 5;
//	int X = 10;
//	int L = 50;
//	int C = 100;
//	int D = 500;
//	int M = 1000;

	static Integer romanToInt(String str) {

		Integer integer = 0;
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		for (int i = 0; i < str.length(); i++) {

			integer += map.get(str.charAt(i));
		}

		return integer;

	}

	public static void main(String[] args) {
		System.out.println(romanToInt("LVIII"));
	}
}
