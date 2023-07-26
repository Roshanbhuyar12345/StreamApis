package com.string;

import java.util.ArrayList;
import java.util.List;

public class NthPrimeNumberSquareSum {

	public static int sumOfSquareOfNthPrimeNumber(int n) {
		int count = 0;
		List<Integer> num = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % 1 == 0 && n % n == 0) {
				count++;
			}

			if (count == 2) {
				num.add(n);
			}
		}
		System.out.println(num);
		return 0;
	}

	public static void main(String[] args) {
		NthPrimeNumberSquareSum.sumOfSquareOfNthPrimeNumber(10);
	}
}
