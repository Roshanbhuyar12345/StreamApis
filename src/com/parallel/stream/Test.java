package com.parallel.stream;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		long start = 0;
		long end = 0;

		start = System.currentTimeMillis();
		list.stream().forEach(s -> System.out.println(s + " " + Thread.currentThread().getName()));
		end = System.currentTimeMillis();

		System.out.println("Execution time of stream :" + (end - start));

		start = System.currentTimeMillis();
		list.parallelStream().forEach(s -> System.out.println(s + " " + Thread.currentThread().getName()));
		end = System.currentTimeMillis();
		System.out.println("Execution time of parralel stream :" + (end - start));

	}

}
