package com.arrays;

public class MissingNumber {
	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		int temp = 0;

		for (int i = 1; i <= num.length; i++) {
			if (i != num[i - 1]) {
				temp = i;
				break;
			}

		}
		System.out.println(temp);

	}
}
