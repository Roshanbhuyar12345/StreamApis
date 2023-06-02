package com.string;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a day");
		String days = scanner.next();

		switch (days) {
		case "sun": {
			System.out.println("Today is sunday");
			break;
		}
		case "mon": {
			System.out.println("Today is monday");
			break;

		}
		case "tue": {
			System.out.println("Today is tuesday");
			break;

		}
		case "wen": {
			System.out.println("Today is wensday");
			break;

		}
		case "thus": {
			System.out.println("Today is thusday");
			break;

		}
		case "fri": {
			System.out.println("Today is frieday");
			break;

		}
		case "sat": {
			System.out.println("Today is saturday");
			break;

		}
		default: {
			System.out.println("Please enter valid day");
		}

		}

	}
}
