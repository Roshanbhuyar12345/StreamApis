package com.arrays;

public class AmstongNumber {

	public static void main(String[] args) {

		int n = 1634;

		int tem = n;

		int num = 0;

		int sum = 0;

		int digit = (int) Math.log10(n) + 1;

		while (n > 0) {

			int rem = n % 10;

			num = (int) Math.pow(rem, digit);

			sum = sum + num;

			n = n / 10;

		}

		if (tem == sum) {
			System.out.println(tem + " number is Amstrong");
		} else {
			System.out.println(tem + " number is not Amstrong");

		}
	}

}
