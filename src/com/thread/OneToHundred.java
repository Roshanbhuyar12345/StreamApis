package com.thread;

public class OneToHundred extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {

			System.out.println(i);
		}

	}

	public static void main(String[] args) {

		OneToHundred t1 = new OneToHundred();

		t1.start();
		String srt = t1.getName();
		System.out.println(srt);
		OneToHundred t2 = new OneToHundred();
		t2.start();

	}
}
