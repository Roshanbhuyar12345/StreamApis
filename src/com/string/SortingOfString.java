package com.string;

public class SortingOfString {
	public static void main(String[] args) {
		String str = "Roshan";
		str = str.toLowerCase();
		char[] charArray = str.toCharArray();

		char temp;
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {

				if (charArray[i] > charArray[j]) {
					temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;

				}
			}
		}
		String name = new String(charArray);
		// for (int i = 0; i < name.length(); i++) {
		System.out.println(name);
		// }

	}
}
