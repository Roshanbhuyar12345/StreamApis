package com.arraylist;

public class EqualWordsInStatment {

	public static void main(String[] args) {

		final String str = "geek for geek geeks";

		String[] strings = str.split(" ");

		for (int i = 0; i < strings.length; i++) {

			for (int j = i + 1; j < strings.length; j++) {

				if (strings[i].equals(strings[j])) {
					System.out.println(strings[j]);
				}

			}

		}

	}
}
