package net.javaguides.springboot.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import net.javaguides.springboot.model.Tickets;
import net.javaguides.springboot.service.TicketsService;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class TicketsController {
	
	
	// Create a Logger
    Logger logger
        = Logger.getLogger(
        		TicketsController.class.getName());
    
    @Autowired
	private TicketsService ticketsService;
    
    
   
    
    
    
    @RequestMapping(value = {"/getTickets"}, method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
	public List<Tickets> getTickets(HttpServletResponse response) {		
		
		logger.info("In getTickets.");
		List<Tickets> ticketList =  ticketsService.getAllTickets();
		ticketList.forEach(System.out::println);
		return  ticketList;
		
	}
    
    @RequestMapping(value = {"/getEventInformation"}, method = RequestMethod.POST)
    @ResponseBody
    public Tickets ticketInfo(@RequestParam("ticketId")  long ticketId, HttpServletResponse httpResponse) throws IOException {		
		logger.info("In getTicketsInformation.");
		Tickets ticket =  ticketsService.getTicketsById(ticketId);
		logger.info(ticket.toString());
		return ticket;
		
	}
    
    @RequestMapping(value = {"/user/ticketsInfo"}, method = RequestMethod.GET)
	  public String tickets() {
		 logger.info("In tickets ");
			 
		 return "ticketInfo.html";
	 }
}
