package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Tickets;



@Service
public interface TicketsService {
	
	List<Tickets> getAllTickets();
	
	Tickets getTicketsById(long a);
}
