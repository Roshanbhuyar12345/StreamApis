package com.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagranPair {
	public static void main(String[] args) {

//		Input: str = ["eat","tea","tan","ate","nat","bat"]
//		Output: [["bat"],["nat","tan"],["ate","eat","tea"]

		String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

		char[] ch = new char[1000];
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();

		for (int i = 0; i < str.length; i++) {

			ch = str[i].toCharArray();
			Arrays.sort(ch);
			// System.out.println(Arrays.toString(ch));
			String newString = new String(ch);
			list1.add(newString);
			list2.add(newString);

		}
		for (int j = 0; j < str.length; j++) {
			String t = list1.get(j);
			String q = list2.get(j);

			if (t.charAt(j) == q.charAt(j)) {
				list3.add(q);
				System.out.println(list3);
			}

		}

	}
}
