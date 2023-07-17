package com.thread;

import java.util.Scanner;

public class Synchronisation extends ticket_booking implements Runnable {
	static ticket_booking ob;
	int seats;

	@Override
	public void run() {
		System.err.println(Thread.currentThread().getName());

		ob.ticket_book(seats);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ob = new ticket_booking();
		System.err.println(Thread.currentThread().getName());
		Synchronisation s = new Synchronisation();
		Synchronisation t1[] = new Synchronisation[s.total_seats];
//
//		Synchronisation t1 = new Synchronisation();
//		Synchronisation t2 = new Synchronisation();
//		Synchronisation t3 = new Synchronisation();

		for (int i = 0; i < t1.length; i++) {

			t1[i] = new Synchronisation();
			Thread t = new Thread(t1[i]);
//			if (t1[i].total_seats == 0) {
//				break;
// 			}

			System.out.println("enter how much ticket you want to book for person : " + (i + 1));
			t1[i].seats = sc.nextInt();
			t.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
