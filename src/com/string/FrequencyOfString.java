package com.string;

public class FrequencyOfString {
	public static void main(String[] args) {

		String str = "geeksforgeeks";
		int a[] = new int[str.length()];
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {

					count++;

					a[j] = -1;
				}

			}
			if (a[i] != -1) {
				a[i] = count;
				System.out.println(str.charAt(i) + "  " + count);
			}

		}

	}
}
