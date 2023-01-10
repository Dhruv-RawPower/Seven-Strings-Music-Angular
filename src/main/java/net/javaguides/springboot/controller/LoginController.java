package net.javaguides.springboot.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.javaguides.springboot.model.Credentials;
import net.javaguides.springboot.model.JwtRequest;
import net.javaguides.springboot.model.JwtResponse;
import net.javaguides.springboot.service.EmployeeService;
import net.javaguides.springboot.ulilities.JwtUtil;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	

	// Create a Logger
    Logger logger
        = Logger.getLogger(
        		LoginController.class.getName());
    
    // Creating Object of ObjectMapper define in Jackson API  
    ObjectMapper Obj = new ObjectMapper();  
    
    
    @Autowired
    private JwtUtil jwtUtility;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private EmployeeService empService;
    
    //Post Mapping
    
    @PostMapping("/loginApi")
	public ResponseEntity<?> login() {
		
    	logger.info("Inside login from angular");
    	return new ResponseEntity<>("Ho gaya connect bhai", HttpStatus.OK);	
    }
    
    @PostMapping("/authenticate")
    @ResponseBody
    public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception{
    	System.out.println(jwtRequest.toString());
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getUsername(),
                            jwtRequest.getPassword()
                    )
            );
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }

        final UserDetails userDetails
                = empService.loadUserByUsername(jwtRequest.getUsername());
        System.out.println("After user loaded");
        
        final String token =
                jwtUtility.generateToken(userDetails);
        
        return  new JwtResponse(token);
    }
    
    
    @RequestMapping(value = "/getCurrentUser", method = RequestMethod.GET)
	public ResponseEntity<?> getCurrentUser() {
		
    	logger.info("Inside login from angular");
    	return new ResponseEntity<>("Ho gaya connect bhai", HttpStatus.OK);	 
    	
    }

}
