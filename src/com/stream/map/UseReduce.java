package com.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UseReduce {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<String> words = Arrays.asList("corejava", "java", "springboot", "hibernate");

		// traditinal method
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum = sum + numbers.get(i);
		}
		System.out.println(sum);

		// using reduce
		Integer sum1 = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum1);

		Optional<Integer> s = numbers.stream().reduce(Integer::sum);
		System.out.println(s.get());

		// numtiplication using reduce

		Integer multiplication = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println(multiplication);

		// Traditinal method
		int mul = 1;
		for (Integer n : numbers) {
			mul = mul * n;
		}

		System.out.println(mul);

		// Max value in array using reduce

		Optional<Integer> reduce = numbers.stream().reduce(Integer::max);
		System.out.println(reduce.get());

		Integer max = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(max);

		// min value
		Integer min = numbers.stream().reduce(1, (a, b) -> a < b ? a : b);
		System.out.println(min);

		// max charecter string
		Optional<String> maxLenthString = words.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2);
		System.out.println(maxLenthString.get());
	}
}
