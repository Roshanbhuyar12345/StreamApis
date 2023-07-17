package com.arraylist;

import java.util.Arrays;
import java.util.List;

public class DivByThreeOrFour {
	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		num.stream().filter(x -> x % 2 == 0 || x % 3 == 0).forEach(System.out::println);
	}
}
