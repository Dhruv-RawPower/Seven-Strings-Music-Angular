package net.javaguides.springboot;

import java.util.logging.Logger;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class SevenStringsMusic{
	
	// Create a Logger
    Logger logger
        = Logger.getLogger(
        		SevenStringsMusic.class.getName());


	public static void main(String[] args) {
		SpringApplication.run(SevenStringsMusic.class, args);

	}
	
		
	
	

}
