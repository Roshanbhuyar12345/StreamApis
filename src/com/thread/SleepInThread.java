package com.thread;

public class SleepInThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		SleepInThread t1 = new SleepInThread();
		SleepInThread t2 = new SleepInThread();

//		t1.run();
//		t2.run();

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
}
