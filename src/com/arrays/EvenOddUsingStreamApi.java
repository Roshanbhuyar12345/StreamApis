package com.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddUsingStreamApi {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.stream(arr).filter(x -> x % 2 == 0).boxed().collect(Collectors.toList());
		System.out.println("even number " + list);

		List<Integer> list1 = Arrays.stream(arr).filter(x -> x % 2 != 0).boxed().collect(Collectors.toList());
		System.out.println("odd number " + list1);

	}

}
