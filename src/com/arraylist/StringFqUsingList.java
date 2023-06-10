package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class StringFqUsingList {
	public static void main(String[] args) {

		List<Character> str = new ArrayList<>();
		str.add('e');
		str.add('n');
		str.add('g');
		str.add('i');
		str.add('n');
		str.add('e');
		str.add('e');
		str.add('r');

		int count = 0;
		int c[] = new int[str.size()];

		int max = 0;
		for (int i = 0; i < str.size(); i++) {
			count = 1;
			for (int j = i + 1; j < str.size(); j++) {

				if (str.get(i) == str.get(j)) {
					count++;
					c[j] = -1;
				}
			}
			if (c[i] != -1) {
				c[i] = count;
				if (c[i] > max) {
					max = c[i];
				}
				System.out.println(str.get(i) + " " + c[i]);
			}
		}

		int secondMax = 0;
		char ch = '\u0000';
		System.out.println(max);

		for (int i = 0; i < c.length; i++) {
			if (c[i] > secondMax && c[i] < max) {
				secondMax = c[i];
				ch = str.get(i);
			}
		}
		System.out.println(secondMax);
		System.out.println("Second most repeated element  is " + ch);
	}
}
