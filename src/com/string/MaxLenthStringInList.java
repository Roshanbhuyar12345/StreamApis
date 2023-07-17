package com.string;

import java.util.Arrays;
import java.util.List;

public class MaxLenthStringInList {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("corejava", "java", "springboot", "hibernate");
		String str[] = new String[words.size()];

		for (int i = 0; i < words.size(); i++) {
			str[i] = words.get(i);
			System.out.println(str[i]);

			if (str[i].length() > str[i].length()) {
				System.out.println(str[i]);
			}

		}

	}
}
