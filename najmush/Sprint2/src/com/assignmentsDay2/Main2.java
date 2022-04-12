package com.assignmentsDay2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter no of bookings");
		int bookings = scan.nextInt();

		System.out.println("Enter the available tickets");
		Ticket.availableTickets = scan.nextInt();
		for (int i = 0; i < bookings; i++) {
			System.out.println("Enter the ticketid");
			int tickteId = scan.nextInt();
			System.out.println("Enter the price ");
			int price = scan.nextInt();

			System.out.println("Enter the no of tickets");
			int numOfTickets = scan.nextInt();

//		System.out.println("Available Tickets");
//		int availableTicket = scan.nextInt();

			Ticket tic = new Ticket();
			int totalPrice = tic.calculateTicketCost(numOfTickets, price);

			System.out.println("Total Amount : " + totalPrice);
			System.out.println("Available ticket after booking: " + Ticket.availableTickets);

			System.out.println();

		}
	}

}
