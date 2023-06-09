package com.string;

public class ValidParentheses {

	public static boolean validParenthesis(String com, char[] str) {
		for (int i = 0; i < str.length; i++) {
			// for (int j = i + 1; j < str.length; j++) {
			System.out.println(str[i] + " ");
			System.out.println(str[i + 1] + " ");
			if (str[i] == str[i + 1]) {
				return true;
			} else {
				return false;
			}

			// }

		}
		return true;
	}

	public static void main(String[] args) {

		char parenthesis[] = { '(', ')', '[', ']', '{', '}' };

		System.out.println(ValidParentheses.validParenthesis("()", parenthesis));
	}

}
