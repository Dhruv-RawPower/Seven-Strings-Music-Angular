package net.javaguides.springboot.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.service.EmployeeService;

@Controller
//@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
//@RequestMapping("/user")
public class EmployeeController {
	

	// Create a Logger
    Logger logger
        = Logger.getLogger(
        		EmployeeController.class.getName());
    
    // Creating Object of ObjectMapper define in Jackson API  
    ObjectMapper Obj = new ObjectMapper();  
    
    
	@Autowired
	private EmployeeService employeeService;
	
	
	
	
	
		
	
	
	//LOGIN
	@RequestMapping(value = {"/signin"}, method = RequestMethod.GET)
	public String login() {
	
	
	Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
   /* if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
    	logger.info("In if signin.");
    	return "signin";
    }
    logger.info("In redirect.");
    return "redirect:/";
	*/
	if (authentication.getPrincipal() instanceof UserDetails) {
		logger.info("In if signin.");
		return "redirect:/";
    } else
    {	
    	logger.info((String) authentication.getPrincipal());
    	logger.info("In else signin.");	
    	return "signin.html";	
	
    }
    
	}
	
	
	
	    
		    
	    
	 
	 //REGISTER 
	 @RequestMapping(value = {"/register"}, method = RequestMethod.GET)
	    public String register() {
		 	logger.info("In register");
		 	return "register.jsp";
	    }
	 
	 
	
	 
	 
	//WELCOME TO SSM
	 @RequestMapping(value = {"/"}, method = RequestMethod.GET)
     public String home(HttpServletRequest request) {
			// String test = request.getHeader("token");
			logger.info("In welcome ");
			if (request.isUserInRole("ROLE_USER")) {
				return "redirect:/user/welcome";
		    }
		
			return "index.html";
			
     }
	 
	 
	 
	 
	 //WELCOME TO SSM
	 @RequestMapping(value = {"/user/welcome"}, method = RequestMethod.GET)
	 public String welcome() {
		// String test = request.getHeader("token");
		 logger.info("In welcome ");
		 
		 return "welcome.html";
	 }
	 
	 
	//WELCOME TO SSM
	  @RequestMapping(value = {"/user/tickets"}, method = RequestMethod.GET)
	  public String tickets() {
		 logger.info("In tickets ");
			 
		 return "tickets.html";
	 }	 
	 
	 
	 
	 
	 

	 
	 

	
}
