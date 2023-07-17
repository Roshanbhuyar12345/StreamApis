package com.javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfEvenNumber {
	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNumArray = num.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumArray);
	}
}
