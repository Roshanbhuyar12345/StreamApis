package com.hashSet;

public class UniqueCharecterInArray {

	public static void main(String[] args) {
		String str = "geeksforgeeks";

		for (int i = 0; i < str.length(); i++) {
			int flag = 0;
			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j) && i != j) {
					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.print(str.charAt(i) + " ");

			}
		}
//		Set<Character> set = new LinkedHashSet<>();
//
//		for (int i = 0; i < str.length(); i++) {
//
//			set.add(str.charAt(i));
//
//		}
//		System.out.println(set);
	}

}
