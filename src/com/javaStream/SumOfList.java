package com.javaStream;

import java.util.Arrays;
import java.util.List;

public class SumOfList {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Integer reduce = numbers.stream().reduce((a, b) -> a + b).get();
		System.out.println(reduce);
	}
}
