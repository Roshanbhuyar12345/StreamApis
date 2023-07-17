package com.javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 22, 44, 23, 45, 67, 7, 8, 2);

		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());

		sorted.forEach(x -> System.out.println(x));
		sorted.forEach(System.out::println);

	}
}
