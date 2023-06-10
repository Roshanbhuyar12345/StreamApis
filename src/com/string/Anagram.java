package com.string;

public class Anagram {
	public static void main(String[] args) {

		String str1 = "RACE";
		String str2 = "CARE";
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {

			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					count++;
				}

			}

		}
		if (str1.length() == str2.length()) {
			if (count == str1.length()) {
				System.out.println("String is Anagram");
			} else {
				System.out.println("String is not Anagram");
			}
		} else {
			System.out.println("String is not Anagram");

		}
	}

}
