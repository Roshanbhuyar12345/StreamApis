package com.arrays;

public class MaxNum {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 3, 3, 2, 6, 7, 9, 5, 6, 7, 54, 32, 1, 45 };
		int arr[] = new int[num.length];
		int temp = 0;
		int secondMax = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;

				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num[i];
			// secondMax = arr[i - 2];

		}
		System.out.println("Second largest number in array is " + arr[arr.length - 2]);

	}

}
