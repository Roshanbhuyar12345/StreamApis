package com.arrays;

public class ArraysSum {
	public static void main(String[] args) {

		String str = "engineer";

		int length[] = new int[str.length()];

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {

					count++;
					length[j] = -1;

				}

			}
			if (length[i] != -1) {
				length[i] = count;
				System.out.println(str.charAt(i) + "   " + count);
			}

		}

	}
}
