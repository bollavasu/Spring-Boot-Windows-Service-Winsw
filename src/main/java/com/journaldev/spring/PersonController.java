package com.journaldev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.scheduling.annotation.Scheduled;
import java.util.Calendar;

@RestController
public class PersonController {
	
	@RequestMapping("/")
	public String healthCheck() {
		return "Welcome to Spring Boot REST...";
	}
	
	@Scheduled(fixedRate = 10000)
    public void printLOg() {
       System.out.println("Current time is :: " + Calendar.getInstance().getTime());
    }
	
}
