package com.arrays;

import java.util.Arrays;

public class NthMaxNumber {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 1, 9, 5 };
		NthMaxNumber.getNthMaximumNumber(3, arr);
	}

	public static int getNthMaximumNumber(int num, int[] arr) {

		Arrays.sort(arr);
		System.out.println(arr[arr.length - num] + " is the " + num + " Heighest number");
		return arr[arr.length - num];
	}

}
