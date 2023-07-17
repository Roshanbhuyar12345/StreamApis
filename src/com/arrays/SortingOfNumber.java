package com.arrays;

public class SortingOfNumber {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 5, 4, 2, 4, 6, 21, 7, 8, 3 };

		int temp = 0;

		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}

			}

		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		int max = 0;
		for (int i = 0; i < num.length; i++) {

			if (num[i] > num[0]) {
				max = num[i];
			}

		}
		System.out.println("max number in arrays is " + max);
	}
}
