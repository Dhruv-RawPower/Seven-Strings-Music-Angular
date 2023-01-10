package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Tickets;
import net.javaguides.springboot.repository.TicketsRepository;

@Service
public class TicketsServiceImpl implements TicketsService {

	@Autowired
	private TicketsRepository ticketsRepository;
	
	@Override
	public List<Tickets> getAllTickets() {
		return ticketsRepository.findAll();
		
	}

	@Override
	public Tickets getTicketsById(long a) {
		// TODO Auto-generated method stub
		Optional<Tickets> optional = ticketsRepository.findById(a);
		Tickets tickets = null;
		if (optional.isPresent()) {
			tickets = optional.get();
		} else {
			throw new RuntimeException(" Ticket not found for id :: " + a);
		}
		return tickets;
	}

	

}
