package com.arrays;

public class PrimeNumber {

	public static boolean isPrime(int n) {

		boolean flag = true;

		if (n == 2) {
			return true;
		}

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				flag = false;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
//		int count = 0;
//		int n = 2;
//		int sum = 0;
//		int nth = 5;
//		while (count < nth) {
//
//			if (PrimeNumber.isPrime(n)) {
//				count++;
//				sum = sum + (n * n);
//			}
//
//			n++;
//
//		}
//		System.out.println(sum);
	}

}
