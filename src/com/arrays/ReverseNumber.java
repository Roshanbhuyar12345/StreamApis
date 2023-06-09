package com.arrays;

public class ReverseNumber {
	public static void main(String[] args) {

		// amstrong num
		int num = 153;

		int rev = 0;
		int rem = 0;
		int result = 0;
		int a = num;
		while (num > 0) {

			rem = num % 10;
			rev = rem * rem * rem;
			result = result + rev;
			num = num / 10;

		}
		if (result == a) {
			System.out.print(" arm");
		} else {
			System.out.println(" not ara");

		}

	}

}
