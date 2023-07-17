package com.string;

import java.util.Arrays;

public class MaxLengthString {
	public static void main(String[] args) {
		String s = "springboot";
		String t = "hibernate";

		String words[] = { "java", "Springboot", "hibernate", "collection", "adjhfasdfasydgauiia" };

		Arrays.stream(words).forEach(x -> System.out.println(x));

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > words[i + 1].length()) {
				System.out.println(words[i] + " word has max length " + words[i].length());
			} else {
				System.out.println(words[i + 1] + " word has max length " + words[i + 1].length());
			}

			// System.out.println(words[i]);

		}

	}
}
