package com.string;

import java.util.Arrays;

public class AnagramUsingPredefineFunction {

	public static void main(String[] args) {

		String str1 = "RACE";
		String str2 = "CARE";

		if (str1.length() == str2.length()) {
			char[] a1 = str1.toCharArray();
			char[] a2 = str2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);

			boolean result = Arrays.equals(a1, a2);
			if (result) {
				System.out.println("String is anagram");
			} else {
				System.out.println("String is not anagram");
			}

		} else {
			System.out.println("String is not anagram ");
		}

	}

}
