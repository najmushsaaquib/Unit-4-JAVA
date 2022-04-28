package com.evaluation.question2;

public class Ticket {

	int ticketid;
	int price;
	int availableTickets;

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAvailableTickets() {
		return availableTickets;
	}

	public  void setAvailableTickets(int availableTickets) {

		if (availableTickets > 0) {

			this.availableTickets = availableTickets;
		} else {
			System.out.println("Invalid Tickets");
		}

	}

	public int calculateTicketCost(int noOfTickets) {

		if (this.availableTickets > noOfTickets) {

			this.availableTickets -= noOfTickets;
			this.price = noOfTickets * price;

			return this.price;

		} else
			return -1;

	}

}
