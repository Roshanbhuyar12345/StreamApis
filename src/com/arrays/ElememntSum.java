package com.arrays;

public class ElememntSum {
	public static void main(String[] args) {

		int num[] = { 8, 2, 1, 10, 6, 6 };
		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == 12) {
					System.out.println(num[i] + " " + num[j]);
				}
			}

		}

	}
}
