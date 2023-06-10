package com.arraylist;

import java.util.ArrayList;

public class SumPair {
	public static void main(String[] args) {
		int arr[] = { 80, 60, 10, 50, 30, 100, 50, 15, 15, 40 };
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == 100) {
					list.add(arr[i]);
					list.add(arr[j]);
				}
			}

		}
		System.out.println(list);
	}

}
