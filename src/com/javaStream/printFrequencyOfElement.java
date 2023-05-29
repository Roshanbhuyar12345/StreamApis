package com.javaStream;

import java.util.Arrays;
import java.util.Comparator;

public class printFrequencyOfElement {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5, 8, 6, 4, 3, 5, 7, 5, 4, 2, 3 };

		Integer SecondLargest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println(SecondLargest);

	}
}
