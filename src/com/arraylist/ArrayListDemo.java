package com.arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {
	public static void main(String[] args) {
		// remove empty string in list using stream api
		List<String> list = Arrays.asList("roshan", "", "hey", "balaji", "");

		List<String> pureString = list.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println(pureString);

		String str[] = { "roshan", "", "hey", "balaji", "" };

		String st[] = new String[str.length];

		for (int i = 0; i < str.length; i++) {

			if (!str[i].isEmpty()) {

				st[i] = str[i];
			}

		}

		for (int i = 0; i < st.length; i++) {
			if (st[i] != null) {
				System.out.println(st[i]);
			}
		}
	}

}
