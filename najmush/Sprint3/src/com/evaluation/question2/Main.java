package com.evaluation.question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter no of bookings");

		int bookings = input.nextInt();

		Ticket tickets = new Ticket();

		System.out.println("Enter the available tickets");
		tickets.availableTickets = input.nextInt();

		for (int i = 0; i < bookings; i++) {

			System.out.println("Enter the ticketid");
			tickets.setTicketid(input.nextInt());

			System.out.println("Enter the price ");
			tickets.setPrice(input.nextInt());

			System.out.println("Enter the no of tickets");
			int numberOfTickets = input.nextInt();

			
			System.out.println("Available tickets : " + tickets.getAvailableTickets());
			System.out.println("Total Amount : " + tickets.calculateTicketCost(numberOfTickets));
			System.out.println("Available tickets after booking : " + tickets.getAvailableTickets());
			System.out.println();
		}
		
		input.close();
		
		System.out.println("Thankyou for booking tickets with us. End of the program.");
	}

}
