package in.tejas.service;

import java.util.List;

import in.tejas.binding.Passenger;
import in.tejas.binding.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger passenger);

	public Ticket getTicket(Integer ticketId);
	
	public List<Ticket> getTickets();

}
