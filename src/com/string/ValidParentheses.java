package com.string;

public class ValidParentheses {

	public static boolean validParenthesis(String str) {
		String St = "()[]{}}";
		String[] ch = St.split("");
		for (int i = 0; i < ch.length; i++) {

			System.out.println(ch[i]);

		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(validParenthesis("()"));

	}

}
