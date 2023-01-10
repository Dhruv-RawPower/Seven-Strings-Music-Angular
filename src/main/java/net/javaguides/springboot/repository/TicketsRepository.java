package net.javaguides.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Tickets;

public interface TicketsRepository extends JpaRepository<Tickets, Long> {

	

		
	

}
