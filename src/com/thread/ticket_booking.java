package com.thread;

public class ticket_booking {

	int total_seats = 10;

	synchronized void ticket_book(int seats) {
		if (total_seats >= seats) {

			System.out.println(" congratulation!..your " + seats + " seats booking confirm");
			total_seats = total_seats - seats;
			System.out.println("seats left: " + total_seats);

		}

		else {
			System.out.println(" Sorry!..your " + seats + " seats booking  is failed");

			System.out.println(" Seats left: " + total_seats);

		}

	}

}
