package com.hashmap;

public class SimpleProgram {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 11 };

//		Arrays.stream(arr).filter(x -> x % 2 == 0 || x % 5 == 0).forEach(System.out::println);
		int emptyArr[] = new int[arr.length];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean key = false;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
//					count++;
					key = true;
				}

			}
			if (key) {
				emptyArr[i] = arr[i];
				count++;
			}

		}
		for (int i = 0; i < count; i++) {
			System.out.println(emptyArr[i]);
		}

		System.out.println("Num\tfreq");
		int c[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int co = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					co++;
					c[j] = -1;
				}
			}
			if (c[i] != -1) {
				System.out.println(arr[i] + "\t" + co);
			}
		}
	}
}
