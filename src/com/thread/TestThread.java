package com.thread;

public class TestThread implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		TestThread t1 = new TestThread();

		Thread ts = new Thread(t1);

		ts.start();

	}
}
