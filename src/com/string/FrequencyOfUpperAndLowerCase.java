package com.string;

public class FrequencyOfUpperAndLowerCase {
	public static void main(String[] args) {

		String str = "Spring Boot";
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		String s = str.replace(" ", "");

		for (int i = 0; i < s.length(); i++) {

			boolean upperCase = Character.isUpperCase(s.charAt(i));

			if (upperCase) {
				upperCaseCount++;
			} else {
				lowerCaseCount++;
			}
		}
		System.out.println("Upper Case : " + upperCaseCount + "\n" + "Lower case : " + lowerCaseCount);

	}
}
