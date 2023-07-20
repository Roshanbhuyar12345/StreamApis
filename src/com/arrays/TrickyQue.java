package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrickyQue {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("3", "5", "D", "C", "+");

		List<Integer> elements = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {

			switch (list.get(i)) {

			case "C": {
				elements.remove(elements.size() - 1);
				break;
			}
			case "D": {
				Integer integer = elements.get(elements.size() - 1);
				int num3 = integer * 2;
				elements.add(num3);
				break;
			}
			case "+": {

				Integer num3 = elements.get(elements.size() - 1);
				Integer num4 = elements.get(elements.size() - 2);

				int num5 = num3 + num4;
				elements.add(num5);
				break;
			}
			default: {
				int parseInt = Integer.parseInt(list.get(i));
				elements.add(parseInt);
				break;
			}

			}

		}
		Integer sum = elements.stream().reduce((a, b) -> a + b).get();

		System.out.println(elements);
		System.out.println(sum);

	}
}