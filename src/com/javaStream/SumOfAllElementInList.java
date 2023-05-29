package com.javaStream;

import java.util.Arrays;
import java.util.List;

public class SumOfAllElementInList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		int sum = list.stream().mapToInt(Integer::intValue).sum();
//		Integer sum1 = 0;
//		for (int i = 0; i < list.size(); i++) {
////			sum1 = list.get(i);
//			sum1 = sum1 + list.get(i);
//		}
		System.out.println(sum);
	}

}
