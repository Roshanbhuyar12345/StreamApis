package com.arrays;

public class Anagram {

	public static void main(String[] args) {

		String str = "listen";
		String st = "silent";

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < st.length(); j++) {

				if (str.charAt(i) == st.charAt(j)) {
					count++;
				}

			}
		}

		if (str.length() == st.length()) {
			if (str.length() == count) {
				System.out.println("String is Anagram");
			} else {
				System.out.println("String is not anagram");
			}
		} else {
			System.out.println("String is not anagram");

		}
	}

}
