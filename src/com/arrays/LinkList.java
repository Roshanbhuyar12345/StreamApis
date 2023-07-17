package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class LinkList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Siddharth");
		list.add("roshan");
		list.add("shubham");

		list.forEach(x -> System.out.println(x));
	}
}
