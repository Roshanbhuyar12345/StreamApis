package com.hashSet;

public class UniqueCharecter {
	public static void main(String[] args) {

		String str = "geeksforgeeks";
		for (int i = 0; i < str.length(); i++) {
			int flag = 0;

			for (int j = 0; j < str.length(); j++) {

				if (i != j && str.charAt(i) == str.charAt(j)) {

					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.println(str.charAt(i) + " ");
			}
		}

	}
}
