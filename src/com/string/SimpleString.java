package com.string;

public class SimpleString {

	public static void main(String[] args) {

		// hear string create object of roshan in SCP in heap memory
		// and when we assing str=rahul it will create new obj in scp and return latest
		// value

		// basically scp is for memory managment
		String str = "roshan";
		str = "rahul";

		System.out.println(str);
	}

}
