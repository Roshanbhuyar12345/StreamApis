package com.string;

public class st {
	public static void main(String[] args) {

		String str = "roshan";
		String rev = "";
		char[] charArray = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(charArray[i]);

			rev = rev + charArray[i];
		}
		System.out.println(rev);
	}
}
