package com.assignmentsDay2;

public class Ticket {

	int ticketid;
	int price;
	static int availableTickets;

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

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		
		if(availableTickets > 0) {
			
			Ticket.availableTickets = availableTickets;
		}
		else {
			System.out.println("House Full, Sold Out!");
		}
		
	}
	
	
	public int calculateTicketCost(int noOfTickets , int price) {
		
		if(Ticket.availableTickets > noOfTickets) {
			
			Ticket.availableTickets -= noOfTickets;
			this.price = noOfTickets * price;
			
			return this.price;
			
		} else return -1;
		
		
		
	}	

}
