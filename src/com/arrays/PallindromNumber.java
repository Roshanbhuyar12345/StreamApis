package com.arrays;

public class PallindromNumber {
	public static void main(String[] args) {

		int n = 12345;
		int rev = 0;
		int rem = 0;
		int temp = n;
		while (n > 0) {

			rem = n % 10;
			rev = rem + (rev * 10);
			n = n / 10;
		}
		System.out.println(rev);
		if (rev == temp) {
			System.out.println("Number is pallindrom");
		} else {
			System.out.println("number is not pallindrom");
		}

	}
}
