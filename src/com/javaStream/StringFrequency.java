package com.javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequency {
//find each char occurence in given string
	public static void main(String[] args) {

		String str = "helloworldjava";

		String[] strArrays = str.split("");

		Map<String, Long> collect = Arrays.stream(strArrays)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

		// duplicate elements in stream
		List<String> list = Arrays.stream(strArrays)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(list);

		List<String> list2 = Arrays.stream(strArrays)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(list2);
	}
}
