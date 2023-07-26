package com.thread;

public class IncrementOfNumbersUsingThread implements Runnable {

	int count = 0;

	@Override
	public void run() {

		for (int i = 1; i <= 1000; i++) {
			checkLoopIncrement();
			// System.out.println(i);
		}
	}

	public synchronized void checkLoopIncrement() {
		count++;
	}

	public synchronized int getCount() {
		return count;
	}

	public static void main(String[] args) throws InterruptedException {
		IncrementOfNumbersUsingThread t = new IncrementOfNumbersUsingThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);

		t1.start();
		t1.join();
		int finalCount = t.getCount();
		System.out.println("Final for thread 1 " + finalCount);
		t2.start();
		t2.join();
		int finalCount1 = t.getCount();
		System.out.println("Final for thread 2 " + finalCount1);
		t3.start();
		t3.join();
		int count = t.getCount();
		System.out.println("Final for thread 3 " + count);
	}

}
