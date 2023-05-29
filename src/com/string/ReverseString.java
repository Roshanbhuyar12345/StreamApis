package com.string;

public class ReverseString {

	public static void main(String[] args) {
		String reverseString = ReverseString.reverseString("Madam");
		System.out.println(reverseString);
	}

	public static String reverseString(String str) {

		String temp = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			temp = temp + str.charAt(i);
		}

		if (str.equalsIgnoreCase(temp)) {
			System.out.println("String is pallindrom " + str);
		} else {
			System.out.println("String is not pallindrom");

		}

		return temp;

	}

}
