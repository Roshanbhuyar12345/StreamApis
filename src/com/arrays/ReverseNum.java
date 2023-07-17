package com.arrays;

public class ReverseNum {
	public static void main(String[] args) {
		int n = 11;

		int rev = 0;
		int tem = n;

		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (rev == tem) {
			System.out.println("number is pallindrom " + tem);
		} else {
			System.out.println("number is not pallindrom " + tem);

		}
	}
}
